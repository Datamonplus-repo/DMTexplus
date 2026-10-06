package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengodatosdevoluciontejido extends GXProcedure
{
   public obtengodatosdevoluciontejido( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengodatosdevoluciontejido.class ), "" );
   }

   public obtengodatosdevoluciontejido( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          int aP2 ,
                          int[] aP3 ,
                          java.math.BigDecimal[] aP4 ,
                          String[] aP5 ,
                          int[] aP6 ,
                          java.math.BigDecimal[] aP7 ,
                          String[] aP8 ,
                          String[] aP9 ,
                          java.math.BigDecimal[] aP10 ,
                          java.math.BigDecimal[] aP11 ,
                          int[] aP12 ,
                          int[] aP13 ,
                          short[] aP14 ,
                          short[] aP15 )
   {
      obtengodatosdevoluciontejido.this.aP16 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
      return aP16[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        int[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        int[] aP12 ,
                        int[] aP13 ,
                        short[] aP14 ,
                        short[] aP15 ,
                        int[] aP16 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             int[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             int[] aP12 ,
                             int[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             int[] aP16 )
   {
      obtengodatosdevoluciontejido.this.AV8Emprcod = aP0;
      obtengodatosdevoluciontejido.this.AV9ALbreccod = aP1;
      obtengodatosdevoluciontejido.this.AV15DevCruId = aP2;
      obtengodatosdevoluciontejido.this.aP3 = aP3;
      obtengodatosdevoluciontejido.this.aP4 = aP4;
      obtengodatosdevoluciontejido.this.aP5 = aP5;
      obtengodatosdevoluciontejido.this.aP6 = aP6;
      obtengodatosdevoluciontejido.this.aP7 = aP7;
      obtengodatosdevoluciontejido.this.aP8 = aP8;
      obtengodatosdevoluciontejido.this.aP9 = aP9;
      obtengodatosdevoluciontejido.this.aP10 = aP10;
      obtengodatosdevoluciontejido.this.aP11 = aP11;
      obtengodatosdevoluciontejido.this.aP12 = aP12;
      obtengodatosdevoluciontejido.this.aP13 = aP13;
      obtengodatosdevoluciontejido.this.aP14 = aP14;
      obtengodatosdevoluciontejido.this.aP15 = aP15;
      obtengodatosdevoluciontejido.this.aP16 = aP16;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18devcru = (short)(0) ;
      AV11AlbRPieDis = 0 ;
      AV12AlbRUniDis = DecimalUtil.ZERO ;
      AV16DevCruPzs = 0 ;
      AV17DevCruUnd = DecimalUtil.ZERO ;
      AV13AlbRPDis = 0 ;
      AV14AlbRUDis = DecimalUtil.ZERO ;
      AV22AlbRPieEnt = 0 ;
      AV25AlbrPieUti = 0 ;
      AV23AlbRUniUti = DecimalUtil.ZERO ;
      AV26albrUniEnt = DecimalUtil.ZERO ;
      /* Using cursor P0AIC2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV15DevCruId), Integer.valueOf(AV9ALbreccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P0AIC2_A44AlbRecCod[0] ;
         A11669DevCruId = P0AIC2_A11669DevCruId[0] ;
         A396EmprCod = P0AIC2_A396EmprCod[0] ;
         A11684DevCruPzs = P0AIC2_A11684DevCruPzs[0] ;
         A11683DevCruUnd = P0AIC2_A11683DevCruUnd[0] ;
         A54AlbRPieUti = P0AIC2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0AIC2_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P0AIC2_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AIC2_A58AlbRUniEnt[0] ;
         A56AlbRUni = P0AIC2_A56AlbRUni[0] ;
         A45AlbRef = P0AIC2_A45AlbRef[0] ;
         A3613AlbRefDsc = P0AIC2_A3613AlbRefDsc[0] ;
         A252CliCod = P0AIC2_A252CliCod[0] ;
         A54AlbRPieUti = P0AIC2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0AIC2_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P0AIC2_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AIC2_A58AlbRUniEnt[0] ;
         A56AlbRUni = P0AIC2_A56AlbRUni[0] ;
         A45AlbRef = P0AIC2_A45AlbRef[0] ;
         A3613AlbRefDsc = P0AIC2_A3613AlbRefDsc[0] ;
         A252CliCod = P0AIC2_A252CliCod[0] ;
         AV11AlbRPieDis = A11684DevCruPzs ;
         AV12AlbRUniDis = A11683DevCruUnd ;
         AV16DevCruPzs = A11684DevCruPzs ;
         AV17DevCruUnd = A11683DevCruUnd ;
         AV13AlbRPDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV14AlbRUDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         AV10AlbRUni = A56AlbRUni ;
         AV19albref = A45AlbRef ;
         AV20albrefdsc = A3613AlbRefDsc ;
         AV18devcru = (short)(1) ;
         AV21ALbrec = (short)(1) ;
         AV22AlbRPieEnt = A52AlbRPieEnt ;
         AV25AlbrPieUti = A54AlbRPieUti ;
         AV23AlbRUniUti = A60AlbRUniUti ;
         AV26albrUniEnt = A58AlbRUniEnt ;
         AV27clicod = A252CliCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18devcru == 0 )
      {
         AV21ALbrec = (short)(0) ;
         /* Using cursor P0AIC3 */
         pr_default.execute(1, new Object[] {AV8Emprcod, Integer.valueOf(AV9ALbreccod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A44AlbRecCod = P0AIC3_A44AlbRecCod[0] ;
            A396EmprCod = P0AIC3_A396EmprCod[0] ;
            A54AlbRPieUti = P0AIC3_A54AlbRPieUti[0] ;
            A52AlbRPieEnt = P0AIC3_A52AlbRPieEnt[0] ;
            A60AlbRUniUti = P0AIC3_A60AlbRUniUti[0] ;
            A58AlbRUniEnt = P0AIC3_A58AlbRUniEnt[0] ;
            A45AlbRef = P0AIC3_A45AlbRef[0] ;
            A3613AlbRefDsc = P0AIC3_A3613AlbRefDsc[0] ;
            A56AlbRUni = P0AIC3_A56AlbRUni[0] ;
            A252CliCod = P0AIC3_A252CliCod[0] ;
            AV11AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
            AV12AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            AV19albref = A45AlbRef ;
            AV20albrefdsc = A3613AlbRefDsc ;
            AV13AlbRPDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
            AV14AlbRUDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            AV10AlbRUni = A56AlbRUni ;
            AV21ALbrec = (short)(1) ;
            AV22AlbRPieEnt = A52AlbRPieEnt ;
            AV25AlbrPieUti = A54AlbRPieUti ;
            AV23AlbRUniUti = A60AlbRUniUti ;
            AV26albrUniEnt = A58AlbRUniEnt ;
            AV27clicod = A252CliCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = obtengodatosdevoluciontejido.this.AV11AlbRPieDis;
      this.aP4[0] = obtengodatosdevoluciontejido.this.AV12AlbRUniDis;
      this.aP5[0] = obtengodatosdevoluciontejido.this.AV10AlbRUni;
      this.aP6[0] = obtengodatosdevoluciontejido.this.AV16DevCruPzs;
      this.aP7[0] = obtengodatosdevoluciontejido.this.AV17DevCruUnd;
      this.aP8[0] = obtengodatosdevoluciontejido.this.AV19albref;
      this.aP9[0] = obtengodatosdevoluciontejido.this.AV20albrefdsc;
      this.aP10[0] = obtengodatosdevoluciontejido.this.AV26albrUniEnt;
      this.aP11[0] = obtengodatosdevoluciontejido.this.AV23AlbRUniUti;
      this.aP12[0] = obtengodatosdevoluciontejido.this.AV22AlbRPieEnt;
      this.aP13[0] = obtengodatosdevoluciontejido.this.AV25AlbrPieUti;
      this.aP14[0] = obtengodatosdevoluciontejido.this.AV21ALbrec;
      this.aP15[0] = obtengodatosdevoluciontejido.this.AV18devcru;
      this.aP16[0] = obtengodatosdevoluciontejido.this.AV27clicod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12AlbRUniDis = DecimalUtil.ZERO ;
      AV10AlbRUni = "" ;
      AV17DevCruUnd = DecimalUtil.ZERO ;
      AV19albref = "" ;
      AV20albrefdsc = "" ;
      AV26albrUniEnt = DecimalUtil.ZERO ;
      AV23AlbRUniUti = DecimalUtil.ZERO ;
      AV14AlbRUDis = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AIC2_A44AlbRecCod = new int[1] ;
      P0AIC2_A11669DevCruId = new int[1] ;
      P0AIC2_A396EmprCod = new String[] {""} ;
      P0AIC2_A11684DevCruPzs = new int[1] ;
      P0AIC2_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIC2_A54AlbRPieUti = new int[1] ;
      P0AIC2_A52AlbRPieEnt = new int[1] ;
      P0AIC2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIC2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIC2_A56AlbRUni = new String[] {""} ;
      P0AIC2_A45AlbRef = new String[] {""} ;
      P0AIC2_A3613AlbRefDsc = new String[] {""} ;
      P0AIC2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      P0AIC3_A44AlbRecCod = new int[1] ;
      P0AIC3_A396EmprCod = new String[] {""} ;
      P0AIC3_A54AlbRPieUti = new int[1] ;
      P0AIC3_A52AlbRPieEnt = new int[1] ;
      P0AIC3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIC3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIC3_A45AlbRef = new String[] {""} ;
      P0AIC3_A3613AlbRefDsc = new String[] {""} ;
      P0AIC3_A56AlbRUni = new String[] {""} ;
      P0AIC3_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.obtengodatosdevoluciontejido__default(),
         new Object[] {
             new Object[] {
            P0AIC2_A44AlbRecCod, P0AIC2_A11669DevCruId, P0AIC2_A396EmprCod, P0AIC2_A11684DevCruPzs, P0AIC2_A11683DevCruUnd, P0AIC2_A54AlbRPieUti, P0AIC2_A52AlbRPieEnt, P0AIC2_A60AlbRUniUti, P0AIC2_A58AlbRUniEnt, P0AIC2_A56AlbRUni,
            P0AIC2_A45AlbRef, P0AIC2_A3613AlbRefDsc, P0AIC2_A252CliCod
            }
            , new Object[] {
            P0AIC3_A44AlbRecCod, P0AIC3_A396EmprCod, P0AIC3_A54AlbRPieUti, P0AIC3_A52AlbRPieEnt, P0AIC3_A60AlbRUniUti, P0AIC3_A58AlbRUniEnt, P0AIC3_A45AlbRef, P0AIC3_A3613AlbRefDsc, P0AIC3_A56AlbRUni, P0AIC3_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV21ALbrec ;
   private short AV18devcru ;
   private short Gx_err ;
   private int AV9ALbreccod ;
   private int AV15DevCruId ;
   private int AV11AlbRPieDis ;
   private int AV16DevCruPzs ;
   private int AV22AlbRPieEnt ;
   private int AV25AlbrPieUti ;
   private int AV27clicod ;
   private int AV13AlbRPDis ;
   private int A44AlbRecCod ;
   private int A11669DevCruId ;
   private int A11684DevCruPzs ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A252CliCod ;
   private java.math.BigDecimal AV12AlbRUniDis ;
   private java.math.BigDecimal AV17DevCruUnd ;
   private java.math.BigDecimal AV26albrUniEnt ;
   private java.math.BigDecimal AV23AlbRUniUti ;
   private java.math.BigDecimal AV14AlbRUDis ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private String AV8Emprcod ;
   private String AV10AlbRUni ;
   private String AV19albref ;
   private String AV20albrefdsc ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A56AlbRUni ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private int[] aP16 ;
   private int[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private int[] aP12 ;
   private int[] aP13 ;
   private short[] aP14 ;
   private short[] aP15 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AIC2_A44AlbRecCod ;
   private int[] P0AIC2_A11669DevCruId ;
   private String[] P0AIC2_A396EmprCod ;
   private int[] P0AIC2_A11684DevCruPzs ;
   private java.math.BigDecimal[] P0AIC2_A11683DevCruUnd ;
   private int[] P0AIC2_A54AlbRPieUti ;
   private int[] P0AIC2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P0AIC2_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0AIC2_A58AlbRUniEnt ;
   private String[] P0AIC2_A56AlbRUni ;
   private String[] P0AIC2_A45AlbRef ;
   private String[] P0AIC2_A3613AlbRefDsc ;
   private int[] P0AIC2_A252CliCod ;
   private int[] P0AIC3_A44AlbRecCod ;
   private String[] P0AIC3_A396EmprCod ;
   private int[] P0AIC3_A54AlbRPieUti ;
   private int[] P0AIC3_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P0AIC3_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0AIC3_A58AlbRUniEnt ;
   private String[] P0AIC3_A45AlbRef ;
   private String[] P0AIC3_A3613AlbRefDsc ;
   private String[] P0AIC3_A56AlbRUni ;
   private int[] P0AIC3_A252CliCod ;
}

final  class obtengodatosdevoluciontejido__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AIC2", "SELECT T1.AlbRecCod, T1.DevCruId, T1.EmprCod, T1.DevCruPzs, T1.DevCruUnd, T2.AlbRPieUti, T2.AlbRPieEnt, T2.AlbRUniUti, T2.AlbRUniEnt, T2.AlbRUni, T2.AlbRef, T2.AlbRefDsc, T2.CliCod FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DevCruId = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.DevCruId, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AIC3", "SELECT AlbRecCod, EmprCod, AlbRPieUti, AlbRPieEnt, AlbRUniUti, AlbRUniEnt, AlbRef, AlbRefDsc, AlbRUni, CliCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

