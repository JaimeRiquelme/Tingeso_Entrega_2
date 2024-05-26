import httpCommon from "../http-common";

const generateRepairs = (data,uso_bono) => {
    return httpCommon.post(`api/v1/repairVehicles/${uso_bono}`, data);
}

const getGenerateRepairs = () => {
    return httpCommon.get("api/v1/repairVehicles/");
}

const getReportAvgHours = () => {
    return httpCommon.get("api/v1/repairVehicles/promedioHorasPorMarca");
}

const getGenerateRepairsById = (id) => {
    return httpCommon.get(`api/v1/repairVehicles/${id}`);
}

const getGenerateRepairsGroupByTipe = () => {
    return httpCommon.get("api/v1/reports/Report1");
}

const getGenerateRepairsGroupByCombustible = (year, month) => {
    return httpCommon.get("api/v1/reports/Report2", {
        params: {
            year: year,
            month: month
        }
    });
}

const getAll = () => {
    return httpCommon.get("api/v1/repairVehicles/");
};

export default {
    generateRepairs,
    getGenerateRepairs,
    getReportAvgHours,
    getGenerateRepairsById,
    getGenerateRepairsGroupByTipe,
    getGenerateRepairsGroupByCombustible,
    getAll
};