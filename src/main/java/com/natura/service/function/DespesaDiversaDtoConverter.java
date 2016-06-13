package com.natura.service.function;
//package com.cargoservice.function;
//
//import com.natura.service.model.ConversorDto;
//import com.natura.service.model.DespesaDiversa;
//import com.natura.service.model.Produto;
//import com.naturaservice.dto.DespesaDiversaDto;
//
///**
// * Created by Murillo on 22/04/2016.
// */
//public class DespesaDiversaDtoConverter extends ConversorDto<DespesaDiversa, DespesaDiversaDto> {
//
//	@Override
//    public DespesaDiversa applyToEntity(DespesaDiversaDto dto) {
//        DespesaDiversa dd = new DespesaDiversa();
//        
//        dd.setId(dto.getId());
//    	dd.setDescricao(dto.getDescricao());
//    	dd.setLocal(dto.getLocal());
//    	dd.setValor(dto.getValor());
//        dd.setData(dto.getData());
//        Produto frete = new Produto();
//        frete.setId(dto.getId());
//        dd.setFrete(frete);
//        return dd;
//    }
//
//	@Override
//	public DespesaDiversaDto applyToDto(DespesaDiversa entidade) {
//		return null;
//	}
//}
