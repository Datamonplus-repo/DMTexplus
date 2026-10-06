package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pset_compraproductoquimico extends GXProcedure
{
   public pset_compraproductoquimico( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pset_compraproductoquimico.class ), "" );
   }

   public pset_compraproductoquimico( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item> aP0 ,
                          String aP1 ,
                          int aP2 )
   {
      pset_compraproductoquimico.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item> aP0 ,
                        String aP1 ,
                        int aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item> aP0 ,
                             String aP1 ,
                             int aP2 ,
                             int[] aP3 )
   {
      pset_compraproductoquimico.this.AV8SDTCompraProductoQuimico = aP0;
      pset_compraproductoquimico.this.AV15EmprCod = aP1;
      pset_compraproductoquimico.this.AV16PrvNum = aP2;
      pset_compraproductoquimico.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14PriCod = "1" ;
      GXv_int1[0] = AV10PedCod ;
      GXv_char2[0] = AV14PriCod ;
      GXv_date3[0] = Gx_date ;
      new app.pcabped(remoteHandle, context).execute( AV15EmprCod, AV16PrvNum, GXv_int1, GXv_char2, GXv_date3) ;
      pset_compraproductoquimico.this.AV10PedCod = GXv_int1[0] ;
      pset_compraproductoquimico.this.AV14PriCod = GXv_char2[0] ;
      pset_compraproductoquimico.this.Gx_date = GXv_date3[0] ;
      AV17PedTot = DecimalUtil.doubleToDec(0) ;
      AV11PrdNum = "" ;
      AV12Cantidad = DecimalUtil.ZERO ;
      AV13PrdPreAct = DecimalUtil.ZERO ;
      AV22GXV1 = 1 ;
      while ( AV22GXV1 <= AV8SDTCompraProductoQuimico.size() )
      {
         AV9SDTCompraProductoQuimicoItem = (app.SdtSDTCompraProductoQuimico_Item)((app.SdtSDTCompraProductoQuimico_Item)AV8SDTCompraProductoQuimico.elementAt(-1+AV22GXV1));
         AV11PrdNum = AV9SDTCompraProductoQuimicoItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Prdnum() ;
         AV12Cantidad = AV9SDTCompraProductoQuimicoItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Cantidad() ;
         AV13PrdPreAct = AV9SDTCompraProductoQuimicoItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact() ;
         if ( GXutil.roundDecimal( AV12Cantidad.multiply(AV13PrdPreAct), 2).doubleValue() > 0 )
         {
            GXv_decimal4[0] = AV12Cantidad ;
            new app.pmodpen(remoteHandle, context).execute( AV15EmprCod, AV11PrdNum, GXv_decimal4) ;
            pset_compraproductoquimico.this.AV12Cantidad = GXv_decimal4[0] ;
            GXv_int1[0] = AV10PedCod ;
            GXv_char2[0] = AV11PrdNum ;
            GXv_decimal4[0] = AV12Cantidad ;
            GXv_decimal5[0] = AV13PrdPreAct ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date3[0] = Gx_date ;
            GXv_char7[0] = "" ;
            new app.plinped(remoteHandle, context).execute( AV15EmprCod, GXv_int1, GXv_char2, GXv_decimal4, GXv_decimal5, GXv_decimal6, GXv_date3, GXv_char7) ;
            pset_compraproductoquimico.this.AV10PedCod = GXv_int1[0] ;
            pset_compraproductoquimico.this.AV11PrdNum = GXv_char2[0] ;
            pset_compraproductoquimico.this.AV12Cantidad = GXv_decimal4[0] ;
            pset_compraproductoquimico.this.AV13PrdPreAct = GXv_decimal5[0] ;
            pset_compraproductoquimico.this.Gx_date = GXv_date3[0] ;
            AV17PedTot = AV17PedTot.add((GXutil.roundDecimal( AV12Cantidad.multiply(AV13PrdPreAct), 2))) ;
         }
         AV22GXV1 = (int)(AV22GXV1+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pset_compraproductoquimico.this.AV10PedCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14PriCod = "" ;
      Gx_date = GXutil.nullDate() ;
      AV17PedTot = DecimalUtil.ZERO ;
      AV11PrdNum = "" ;
      AV12Cantidad = DecimalUtil.ZERO ;
      AV13PrdPreAct = DecimalUtil.ZERO ;
      AV9SDTCompraProductoQuimicoItem = new app.SdtSDTCompraProductoQuimico_Item(remoteHandle, context);
      GXv_int1 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_char7 = new String[1] ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV16PrvNum ;
   private int AV10PedCod ;
   private int AV22GXV1 ;
   private int GXv_int1[] ;
   private java.math.BigDecimal AV17PedTot ;
   private java.math.BigDecimal AV12Cantidad ;
   private java.math.BigDecimal AV13PrdPreAct ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String AV15EmprCod ;
   private String AV14PriCod ;
   private String AV11PrdNum ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private java.util.Date Gx_date ;
   private java.util.Date GXv_date3[] ;
   private int[] aP3 ;
   private GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item> AV8SDTCompraProductoQuimico ;
   private app.SdtSDTCompraProductoQuimico_Item AV9SDTCompraProductoQuimicoItem ;
}

