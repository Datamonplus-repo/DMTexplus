package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccdef1_datos extends GXProcedure
{
   public controlcalidad_ccdef1_datos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccdef1_datos.class ), "" );
   }

   public controlcalidad_ccdef1_datos( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      controlcalidad_ccdef1_datos.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 )
   {
      controlcalidad_ccdef1_datos.this.A396EmprCod = aP0;
      controlcalidad_ccdef1_datos.this.A4031CCTCod = aP1;
      controlcalidad_ccdef1_datos.this.AV8cctlin = aP2;
      controlcalidad_ccdef1_datos.this.aP3 = aP3;
      controlcalidad_ccdef1_datos.this.aP4 = aP4;
      controlcalidad_ccdef1_datos.this.aP5 = aP5;
      controlcalidad_ccdef1_datos.this.aP6 = aP6;
      controlcalidad_ccdef1_datos.this.aP7 = aP7;
      controlcalidad_ccdef1_datos.this.aP8 = aP8;
      controlcalidad_ccdef1_datos.this.aP9 = aP9;
      controlcalidad_ccdef1_datos.this.aP10 = aP10;
      controlcalidad_ccdef1_datos.this.aP11 = aP11;
      controlcalidad_ccdef1_datos.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9CCTLinDsc = "" ;
      AV10CCTLinDc2 = "" ;
      AV11CCVNorma = "" ;
      AV12CCTLinVarWrd = "" ;
      AV13CCVEspe2 = "" ;
      AV14CCTLinLgoDat = (short)(0) ;
      AV15CCTLinPict = "" ;
      AV16CCTSta = "" ;
      AV17CCTLinTpoDat = "" ;
      AV19CCTLinTpoIng = "" ;
      /* Using cursor P0AP62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(AV8cctlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4034CCTLin = P0AP62_A4034CCTLin[0] ;
         A4043CCTLinDsc = P0AP62_A4043CCTLinDsc[0] ;
         A14344CCTLinDc2 = P0AP62_A14344CCTLinDc2[0] ;
         A13249CCVNorma = P0AP62_A13249CCVNorma[0] ;
         A4047CCTLinVarW = P0AP62_A4047CCTLinVarW[0] ;
         A14345CCVEspe2 = P0AP62_A14345CCVEspe2[0] ;
         A4045CCTLinLgoD = P0AP62_A4045CCTLinLgoD[0] ;
         A4046CCTLinPict = P0AP62_A4046CCTLinPict[0] ;
         A4408CCTSta = P0AP62_A4408CCTSta[0] ;
         A4044CCTLinTpoD = P0AP62_A4044CCTLinTpoD[0] ;
         A4048CCTLinTpoI = P0AP62_A4048CCTLinTpoI[0] ;
         A4037CCTTpoCtr = P0AP62_A4037CCTTpoCtr[0] ;
         A4037CCTTpoCtr = P0AP62_A4037CCTTpoCtr[0] ;
         AV9CCTLinDsc = A4043CCTLinDsc ;
         AV10CCTLinDc2 = A14344CCTLinDc2 ;
         AV11CCVNorma = A13249CCVNorma ;
         AV12CCTLinVarWrd = A4047CCTLinVarW ;
         AV13CCVEspe2 = A14345CCVEspe2 ;
         AV14CCTLinLgoDat = A4045CCTLinLgoD ;
         AV15CCTLinPict = A4046CCTLinPict ;
         AV16CCTSta = A4408CCTSta ;
         AV17CCTLinTpoDat = A4044CCTLinTpoD ;
         AV19CCTLinTpoIng = A4048CCTLinTpoI ;
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, "I") == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, "D") == 0 ) )
         {
            AV19CCTLinTpoIng = "L" ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlcalidad_ccdef1_datos.this.AV9CCTLinDsc;
      this.aP4[0] = controlcalidad_ccdef1_datos.this.AV10CCTLinDc2;
      this.aP5[0] = controlcalidad_ccdef1_datos.this.AV11CCVNorma;
      this.aP6[0] = controlcalidad_ccdef1_datos.this.AV12CCTLinVarWrd;
      this.aP7[0] = controlcalidad_ccdef1_datos.this.AV13CCVEspe2;
      this.aP8[0] = controlcalidad_ccdef1_datos.this.AV14CCTLinLgoDat;
      this.aP9[0] = controlcalidad_ccdef1_datos.this.AV15CCTLinPict;
      this.aP10[0] = controlcalidad_ccdef1_datos.this.AV16CCTSta;
      this.aP11[0] = controlcalidad_ccdef1_datos.this.AV19CCTLinTpoIng;
      this.aP12[0] = controlcalidad_ccdef1_datos.this.AV17CCTLinTpoDat;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9CCTLinDsc = "" ;
      AV10CCTLinDc2 = "" ;
      AV11CCVNorma = "" ;
      AV12CCTLinVarWrd = "" ;
      AV13CCVEspe2 = "" ;
      AV15CCTLinPict = "" ;
      AV16CCTSta = "" ;
      AV19CCTLinTpoIng = "" ;
      AV17CCTLinTpoDat = "" ;
      scmdbuf = "" ;
      P0AP62_A396EmprCod = new String[] {""} ;
      P0AP62_A4031CCTCod = new int[1] ;
      P0AP62_A4034CCTLin = new short[1] ;
      P0AP62_A4043CCTLinDsc = new String[] {""} ;
      P0AP62_A14344CCTLinDc2 = new String[] {""} ;
      P0AP62_A13249CCVNorma = new String[] {""} ;
      P0AP62_A4047CCTLinVarW = new String[] {""} ;
      P0AP62_A14345CCVEspe2 = new String[] {""} ;
      P0AP62_A4045CCTLinLgoD = new short[1] ;
      P0AP62_A4046CCTLinPict = new String[] {""} ;
      P0AP62_A4408CCTSta = new String[] {""} ;
      P0AP62_A4044CCTLinTpoD = new String[] {""} ;
      P0AP62_A4048CCTLinTpoI = new String[] {""} ;
      P0AP62_A4037CCTTpoCtr = new String[] {""} ;
      A4043CCTLinDsc = "" ;
      A14344CCTLinDc2 = "" ;
      A13249CCVNorma = "" ;
      A4047CCTLinVarW = "" ;
      A14345CCVEspe2 = "" ;
      A4046CCTLinPict = "" ;
      A4408CCTSta = "" ;
      A4044CCTLinTpoD = "" ;
      A4048CCTLinTpoI = "" ;
      A4037CCTTpoCtr = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef1_datos__default(),
         new Object[] {
             new Object[] {
            P0AP62_A396EmprCod, P0AP62_A4031CCTCod, P0AP62_A4034CCTLin, P0AP62_A4043CCTLinDsc, P0AP62_A14344CCTLinDc2, P0AP62_A13249CCVNorma, P0AP62_A4047CCTLinVarW, P0AP62_A14345CCVEspe2, P0AP62_A4045CCTLinLgoD, P0AP62_A4046CCTLinPict,
            P0AP62_A4408CCTSta, P0AP62_A4044CCTLinTpoD, P0AP62_A4048CCTLinTpoI, P0AP62_A4037CCTTpoCtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8cctlin ;
   private short AV14CCTLinLgoDat ;
   private short A4034CCTLin ;
   private short A4045CCTLinLgoD ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private String A396EmprCod ;
   private String AV9CCTLinDsc ;
   private String AV10CCTLinDc2 ;
   private String AV11CCVNorma ;
   private String AV12CCTLinVarWrd ;
   private String AV15CCTLinPict ;
   private String AV16CCTSta ;
   private String AV19CCTLinTpoIng ;
   private String AV17CCTLinTpoDat ;
   private String scmdbuf ;
   private String A4043CCTLinDsc ;
   private String A14344CCTLinDc2 ;
   private String A13249CCVNorma ;
   private String A4047CCTLinVarW ;
   private String A4046CCTLinPict ;
   private String A4408CCTSta ;
   private String A4044CCTLinTpoD ;
   private String A4048CCTLinTpoI ;
   private String A4037CCTTpoCtr ;
   private String AV13CCVEspe2 ;
   private String A14345CCVEspe2 ;
   private String[] aP12 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AP62_A396EmprCod ;
   private int[] P0AP62_A4031CCTCod ;
   private short[] P0AP62_A4034CCTLin ;
   private String[] P0AP62_A4043CCTLinDsc ;
   private String[] P0AP62_A14344CCTLinDc2 ;
   private String[] P0AP62_A13249CCVNorma ;
   private String[] P0AP62_A4047CCTLinVarW ;
   private String[] P0AP62_A14345CCVEspe2 ;
   private short[] P0AP62_A4045CCTLinLgoD ;
   private String[] P0AP62_A4046CCTLinPict ;
   private String[] P0AP62_A4408CCTSta ;
   private String[] P0AP62_A4044CCTLinTpoD ;
   private String[] P0AP62_A4048CCTLinTpoI ;
   private String[] P0AP62_A4037CCTTpoCtr ;
}

final  class controlcalidad_ccdef1_datos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AP62", "SELECT T1.EmprCod, T1.CCTCod, T1.CCTLin, T1.CCTLinDsc, T1.CCTLinDc2, T1.CCVNorma, T1.CCTLinVarW, T1.CCVEspe2, T1.CCTLinLgoD, T1.CCTLinPict, T1.CCTSta, T1.CCTLinTpoD, T1.CCTLinTpoI, T2.CCTTpoCtr FROM (TXPCCDef1 T1 INNER JOIN TXPCCDef T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod) WHERE T1.EmprCod = ? and T1.CCTCod = ? and T1.CCTLin = ? ORDER BY T1.EmprCod, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 32);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((String[]) buf[10])[0] = rslt.getString(11, 40);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

