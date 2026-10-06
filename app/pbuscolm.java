package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscolm extends GXProcedure
{
   public pbuscolm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscolm.class ), "" );
   }

   public pbuscolm( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           byte[] aP3 ,
                           String[] aP4 )
   {
      pbuscolm.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      pbuscolm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbuscolm.this.A135BarColNom = aP1[0];
      this.aP1 = aP1;
      pbuscolm.this.A136BarColNum = aP2[0];
      this.aP2 = aP2;
      pbuscolm.this.A218BarTipCol = aP3[0];
      this.aP3 = aP3;
      pbuscolm.this.AV14TablaHdrs_SDTJson2 = aP4[0];
      this.aP4 = aP4;
      pbuscolm.this.AV9Ok_hdrs = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10i = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV8Tab_hdr[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      AV9Ok_hdrs = (byte)(0) ;
      /* Using cursor P02NA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P02NA2_A213BarSit[0] ;
         A129BarCod = P02NA2_A129BarCod[0] ;
         A132BarCodReo = P02NA2_A132BarCodReo[0] ;
         A130BarCodPar = P02NA2_A130BarCodPar[0] ;
         A120BarAgrEst = P02NA2_A120BarAgrEst[0] ;
         if ( ( A213BarSit == 1 ) || ( A213BarSit == 4 ) )
         {
            AV11Barcod = A129BarCod ;
            AV12Barcodreo = A132BarCodReo ;
            AV13Barcodpar = A130BarCodPar ;
            if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV11Barcod, AV12Barcodreo, AV13Barcodpar) ;
            }
            if ( ( AV11Barcod == A129BarCod ) && ( AV12Barcodreo == A132BarCodReo ) && ( GXutil.strcmp(AV13Barcodpar, A130BarCodPar) == 0 ) )
            {
               AV15TabladeHdrs_SDTItem = (app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem)new app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem(remoteHandle, context);
               AV15TabladeHdrs_SDTItem.setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod( A129BarCod );
               AV15TabladeHdrs_SDTItem.setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo( A132BarCodReo );
               AV15TabladeHdrs_SDTItem.setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar( A130BarCodPar );
               AV16TablaHdrs_SDT.add(AV15TabladeHdrs_SDTItem, 0);
               AV10i = (short)(AV10i+1) ;
               AV9Ok_hdrs = (byte)(1) ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV14TablaHdrs_SDTJson2 = AV16TablaHdrs_SDT.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuscolm.this.A396EmprCod;
      this.aP1[0] = pbuscolm.this.A135BarColNom;
      this.aP2[0] = pbuscolm.this.A136BarColNum;
      this.aP3[0] = pbuscolm.this.A218BarTipCol;
      this.aP4[0] = pbuscolm.this.AV14TablaHdrs_SDTJson2;
      this.aP5[0] = pbuscolm.this.AV9Ok_hdrs;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Tab_hdr = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV8Tab_hdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P02NA2_A396EmprCod = new String[] {""} ;
      P02NA2_A135BarColNom = new String[] {""} ;
      P02NA2_A136BarColNum = new int[1] ;
      P02NA2_A218BarTipCol = new byte[1] ;
      P02NA2_A213BarSit = new byte[1] ;
      P02NA2_A129BarCod = new int[1] ;
      P02NA2_A132BarCodReo = new byte[1] ;
      P02NA2_A130BarCodPar = new String[] {""} ;
      P02NA2_A120BarAgrEst = new String[] {""} ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      AV13Barcodpar = "" ;
      AV15TabladeHdrs_SDTItem = new app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem(remoteHandle, context);
      AV16TablaHdrs_SDT = new GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem>(app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem.class, "TabladeHdrs_SDTItem", "TexplusNET", remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuscolm__default(),
         new Object[] {
             new Object[] {
            P02NA2_A396EmprCod, P02NA2_A135BarColNom, P02NA2_A136BarColNum, P02NA2_A218BarTipCol, P02NA2_A213BarSit, P02NA2_A129BarCod, P02NA2_A132BarCodReo, P02NA2_A130BarCodPar, P02NA2_A120BarAgrEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A218BarTipCol ;
   private byte AV9Ok_hdrs ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte AV12Barcodreo ;
   private short AV10i ;
   private short Gx_err ;
   private int A136BarColNum ;
   private int GX_I ;
   private int A129BarCod ;
   private int AV11Barcod ;
   private String A396EmprCod ;
   private String A135BarColNom ;
   private String AV8Tab_hdr[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String AV13Barcodpar ;
   private String AV14TablaHdrs_SDTJson2 ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02NA2_A396EmprCod ;
   private String[] P02NA2_A135BarColNom ;
   private int[] P02NA2_A136BarColNum ;
   private byte[] P02NA2_A218BarTipCol ;
   private byte[] P02NA2_A213BarSit ;
   private int[] P02NA2_A129BarCod ;
   private byte[] P02NA2_A132BarCodReo ;
   private String[] P02NA2_A130BarCodPar ;
   private String[] P02NA2_A120BarAgrEst ;
   private GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem> AV16TablaHdrs_SDT ;
   private app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem AV15TabladeHdrs_SDTItem ;
}

final  class pbuscolm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02NA2", "SELECT EmprCod, BarColNom, BarColNum, BarTipCol, BarSit, BarCod, BarCodReo, BarCodPar, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarColNom = ? and BarColNum = ? and BarTipCol = ? ORDER BY EmprCod, BarColNom, BarColNum, BarTipCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

