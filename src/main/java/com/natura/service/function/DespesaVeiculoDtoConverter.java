package com.natura.service.function;
//package com.cargoservice.function;
//
//import com.natura.service.model.ConversorDto;
//import com.natura.service.model.DespesaVeiculo;
//import com.natura.service.model.Produto;
//import com.naturaservice.dto.DespesaVeiculoDto;
//
///**
// * Created by Murillo on 22/04/2016.
// */
//public class DespesaVeiculoDtoConverter extends ConversorDto<DespesaVeiculo, DespesaVeiculoDto> {
//
//	@Override
//    public DespesaVeiculo applyToEntity(DespesaVeiculoDto dto) {
//        DespesaVeiculo dv = new DespesaVeiculo();
//        
//        dv.setId(dto.getId());
//        dv.setTipoDespesa(dto.getTipoDespesa());
//        dv.setValorDespesa(dto.getValorDespesa());
//        dv.setDataLancamentoDespesa(dto.getDataLancamentoDespesa());
//        Produto frete = new Produto();
//        frete.setId(dto.getFrete());
//        dv.setFrete(frete);
//		return dv;
//    }
//
//	@Override
//	public DespesaVeiculoDto applyToDto(DespesaVeiculo entidade) {
//		return null;
//	}
//}
