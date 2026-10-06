package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpproduccionmaquina extends GXProcedure
{
   public dpproduccionmaquina( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpproduccionmaquina.class ), "" );
   }

   public dpproduccionmaquina( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtsdtProduccionMaquina> executeUdp( String aP0 ,
                                                                    String aP1 ,
                                                                    java.util.Date aP2 ,
                                                                    java.util.Date aP3 )
   {
      dpproduccionmaquina.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<app.SdtsdtProduccionMaquina>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 ,
                        GXBaseCollection<app.SdtsdtProduccionMaquina>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             GXBaseCollection<app.SdtsdtProduccionMaquina>[] aP4 )
   {
      dpproduccionmaquina.this.AV5MaqCodIni = aP0;
      dpproduccionmaquina.this.AV6MaqCodFin = aP1;
      dpproduccionmaquina.this.AV7HisProDTI = aP2;
      dpproduccionmaquina.this.AV8HisProDTF = aP3;
      dpproduccionmaquina.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000G3 */
      pr_default.execute(0, new Object[] {AV7HisProDTI, AV8HisProDTF, AV5MaqCodIni, AV6MaqCodFin});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P000G3_A602MaqCod[0] ;
         A396EmprCod = P000G3_A396EmprCod[0] ;
         A606MaqDsc = P000G3_A606MaqDsc[0] ;
         n606MaqDsc = P000G3_n606MaqDsc[0] ;
         A40000GXC1 = P000G3_A40000GXC1[0] ;
         n40000GXC1 = P000G3_n40000GXC1[0] ;
         A40001GXC2 = P000G3_A40001GXC2[0] ;
         n40001GXC2 = P000G3_n40001GXC2[0] ;
         A40000GXC1 = P000G3_A40000GXC1[0] ;
         n40000GXC1 = P000G3_n40000GXC1[0] ;
         A40001GXC2 = P000G3_A40001GXC2[0] ;
         n40001GXC2 = P000G3_n40001GXC2[0] ;
         Gxm1sdtproduccionmaquina = (app.SdtsdtProduccionMaquina)new app.SdtsdtProduccionMaquina(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtproduccionmaquina, 0);
         Gxm1sdtproduccionmaquina.setgxTv_SdtsdtProduccionMaquina_Maqcod( A602MaqCod );
         Gxm1sdtproduccionmaquina.setgxTv_SdtsdtProduccionMaquina_Maqdsc( A606MaqDsc );
         Gxm1sdtproduccionmaquina.setgxTv_SdtsdtProduccionMaquina_Kilos( A40000GXC1 );
         Gxm1sdtproduccionmaquina.setgxTv_SdtsdtProduccionMaquina_Metros( A40001GXC2 );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = dpproduccionmaquina.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtsdtProduccionMaquina>(app.SdtsdtProduccionMaquina.class, "sdtProduccionMaquina", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P000G3_A602MaqCod = new String[] {""} ;
      P000G3_A396EmprCod = new String[] {""} ;
      P000G3_A606MaqDsc = new String[] {""} ;
      P000G3_n606MaqDsc = new boolean[] {false} ;
      P000G3_A40000GXC1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G3_n40000GXC1 = new boolean[] {false} ;
      P000G3_A40001GXC2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000G3_n40001GXC2 = new boolean[] {false} ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A606MaqDsc = "" ;
      A40000GXC1 = DecimalUtil.ZERO ;
      A40001GXC2 = DecimalUtil.ZERO ;
      Gxm1sdtproduccionmaquina = new app.SdtsdtProduccionMaquina(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpproduccionmaquina__default(),
         new Object[] {
             new Object[] {
            P000G3_A602MaqCod, P000G3_A396EmprCod, P000G3_A606MaqDsc, P000G3_n606MaqDsc, P000G3_A40000GXC1, P000G3_n40000GXC1, P000G3_A40001GXC2, P000G3_n40001GXC2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal A40000GXC1 ;
   private java.math.BigDecimal A40001GXC2 ;
   private String AV5MaqCodIni ;
   private String AV6MaqCodFin ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private java.util.Date AV7HisProDTI ;
   private java.util.Date AV8HisProDTF ;
   private boolean n606MaqDsc ;
   private boolean n40000GXC1 ;
   private boolean n40001GXC2 ;
   private GXBaseCollection<app.SdtsdtProduccionMaquina>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P000G3_A602MaqCod ;
   private String[] P000G3_A396EmprCod ;
   private String[] P000G3_A606MaqDsc ;
   private boolean[] P000G3_n606MaqDsc ;
   private java.math.BigDecimal[] P000G3_A40000GXC1 ;
   private boolean[] P000G3_n40000GXC1 ;
   private java.math.BigDecimal[] P000G3_A40001GXC2 ;
   private boolean[] P000G3_n40001GXC2 ;
   private GXBaseCollection<app.SdtsdtProduccionMaquina> Gxm2rootcol ;
   private app.SdtsdtProduccionMaquina Gxm1sdtproduccionmaquina ;
}

final  class dpproduccionmaquina__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000G3", "SELECT T1.MaqCod, T1.EmprCod, T1.MaqDsc, COALESCE( T2.GXC1, 0) AS GXC1, COALESCE( T2.GXC2, 0) AS GXC2 FROM (TXPMAQUIN T1 LEFT JOIN (SELECT SUM(HisProKgr) AS GXC1, EmprCod, MaqCod, SUM(HisProMtr) AS GXC2 FROM TXPLHIPRO WHERE HisProDTI >= ? and HisProDTF <= ? and (ParCod = 0) GROUP BY EmprCod, MaqCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = '001' and T1.MaqCod >= ?) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

