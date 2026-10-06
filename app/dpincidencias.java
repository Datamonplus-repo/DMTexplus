package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpincidencias extends GXProcedure
{
   public dpincidencias( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpincidencias.class ), "" );
   }

   public dpincidencias( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTIncidencias> executeUdp( String aP0 ,
                                                              java.util.Date aP1 ,
                                                              java.util.Date aP2 ,
                                                              String aP3 ,
                                                              int aP4 ,
                                                              byte aP5 ,
                                                              String aP6 )
   {
      dpincidencias.this.aP7 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTIncidencias>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        String aP6 ,
                        GXBaseCollection<app.SdtSDTIncidencias>[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             String aP6 ,
                             GXBaseCollection<app.SdtSDTIncidencias>[] aP7 )
   {
      dpincidencias.this.AV5Emprcod = aP0;
      dpincidencias.this.AV7Inc_diainicio = aP1;
      dpincidencias.this.AV8Inc_diaFin = aP2;
      dpincidencias.this.AV6Inc_prog = aP3;
      dpincidencias.this.AV9Inc_Barcod = aP4;
      dpincidencias.this.AV10Inc_Barreo = aP5;
      dpincidencias.this.AV11Inc_barpar = aP6;
      dpincidencias.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      lV6Inc_prog = GXutil.padr( GXutil.rtrim( AV6Inc_prog), 10, "%") ;
      /* Using cursor P00112 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV7Inc_diainicio, lV6Inc_prog, AV6Inc_prog, Integer.valueOf(AV9Inc_Barcod), Integer.valueOf(AV9Inc_Barcod), Byte.valueOf(AV10Inc_Barreo), Byte.valueOf(AV10Inc_Barreo), AV11Inc_barpar, AV11Inc_barpar, AV8Inc_diaFin});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4935Inc_Prog = P00112_A4935Inc_Prog[0] ;
         A4929Inc_Dia = P00112_A4929Inc_Dia[0] ;
         A396EmprCod = P00112_A396EmprCod[0] ;
         A4932Inc_Hora = P00112_A4932Inc_Hora[0] ;
         A4933Inc_Usuari = P00112_A4933Inc_Usuari[0] ;
         A4934Inc_Termin = P00112_A4934Inc_Termin[0] ;
         A4931Inc_Linea = P00112_A4931Inc_Linea[0] ;
         A5301Inc_BarPar = P00112_A5301Inc_BarPar[0] ;
         A5300Inc_BarReo = P00112_A5300Inc_BarReo[0] ;
         A5299Inc_Barcod = P00112_A5299Inc_Barcod[0] ;
         A13713Inc_Hdr = GXutil.trim( GXutil.str( A5299Inc_Barcod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A5300Inc_BarReo, 1, 0)) + A5301Inc_BarPar ;
         Gxm1sdtincidencias = (app.SdtSDTIncidencias)new app.SdtSDTIncidencias(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtincidencias, 0);
         Gxm1sdtincidencias.setgxTv_SdtSDTIncidencias_Inc_dia( A4929Inc_Dia );
         Gxm1sdtincidencias.setgxTv_SdtSDTIncidencias_Inc_linea( A4931Inc_Linea );
         Gxm1sdtincidencias.setgxTv_SdtSDTIncidencias_Inc_hora( A4932Inc_Hora );
         Gxm1sdtincidencias.setgxTv_SdtSDTIncidencias_Inc_usuario( A4933Inc_Usuari );
         Gxm1sdtincidencias.setgxTv_SdtSDTIncidencias_Inc_terminal( A4934Inc_Termin );
         Gxm1sdtincidencias.setgxTv_SdtSDTIncidencias_Inc_prog( A4935Inc_Prog );
         GXt_char1 = "" ;
         GXv_char2[0] = A396EmprCod ;
         GXv_date3[0] = A4929Inc_Dia ;
         GXv_int4[0] = A4931Inc_Linea ;
         GXv_char5[0] = GXt_char1 ;
         new app.txtobs(remoteHandle, context).execute( GXv_char2, GXv_date3, GXv_int4, GXv_char5) ;
         dpincidencias.this.A396EmprCod = GXv_char2[0] ;
         dpincidencias.this.A4929Inc_Dia = GXv_date3[0] ;
         dpincidencias.this.A4931Inc_Linea = GXv_int4[0] ;
         dpincidencias.this.GXt_char1 = GXv_char5[0] ;
         Gxm1sdtincidencias.setgxTv_SdtSDTIncidencias_Inc_obstxt( GXt_char1 );
         Gxm1sdtincidencias.setgxTv_SdtSDTIncidencias_Inc_barcod( A5299Inc_Barcod );
         Gxm1sdtincidencias.setgxTv_SdtSDTIncidencias_Inc_barreo( A5300Inc_BarReo );
         Gxm1sdtincidencias.setgxTv_SdtSDTIncidencias_Inc_barpar( A5301Inc_BarPar );
         Gxm1sdtincidencias.setgxTv_SdtSDTIncidencias_Inc_hdr( A13713Inc_Hdr );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = dpincidencias.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTIncidencias>(app.SdtSDTIncidencias.class, "SDTIncidencias", "TexplusNET", remoteHandle);
      lV6Inc_prog = "" ;
      scmdbuf = "" ;
      P00112_A4935Inc_Prog = new String[] {""} ;
      P00112_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P00112_A396EmprCod = new String[] {""} ;
      P00112_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      P00112_A4933Inc_Usuari = new String[] {""} ;
      P00112_A4934Inc_Termin = new String[] {""} ;
      P00112_A4931Inc_Linea = new long[1] ;
      P00112_A5301Inc_BarPar = new String[] {""} ;
      P00112_A5300Inc_BarReo = new byte[1] ;
      P00112_A5299Inc_Barcod = new int[1] ;
      A4935Inc_Prog = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A4933Inc_Usuari = "" ;
      A4934Inc_Termin = "" ;
      A5301Inc_BarPar = "" ;
      A13713Inc_Hdr = "" ;
      Gxm1sdtincidencias = new app.SdtSDTIncidencias(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_int4 = new long[1] ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpincidencias__default(),
         new Object[] {
             new Object[] {
            P00112_A4935Inc_Prog, P00112_A4929Inc_Dia, P00112_A396EmprCod, P00112_A4932Inc_Hora, P00112_A4933Inc_Usuari, P00112_A4934Inc_Termin, P00112_A4931Inc_Linea, P00112_A5301Inc_BarPar, P00112_A5300Inc_BarReo, P00112_A5299Inc_Barcod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Inc_Barreo ;
   private byte A5300Inc_BarReo ;
   private short Gx_err ;
   private int AV9Inc_Barcod ;
   private int A5299Inc_Barcod ;
   private long A4931Inc_Linea ;
   private long GXv_int4[] ;
   private String AV5Emprcod ;
   private String AV6Inc_prog ;
   private String AV11Inc_barpar ;
   private String lV6Inc_prog ;
   private String scmdbuf ;
   private String A4935Inc_Prog ;
   private String A396EmprCod ;
   private String A4933Inc_Usuari ;
   private String A4934Inc_Termin ;
   private String A5301Inc_BarPar ;
   private String A13713Inc_Hdr ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date AV7Inc_diainicio ;
   private java.util.Date AV8Inc_diaFin ;
   private java.util.Date A4929Inc_Dia ;
   private java.util.Date GXv_date3[] ;
   private GXBaseCollection<app.SdtSDTIncidencias>[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P00112_A4935Inc_Prog ;
   private java.util.Date[] P00112_A4929Inc_Dia ;
   private String[] P00112_A396EmprCod ;
   private java.util.Date[] P00112_A4932Inc_Hora ;
   private String[] P00112_A4933Inc_Usuari ;
   private String[] P00112_A4934Inc_Termin ;
   private long[] P00112_A4931Inc_Linea ;
   private String[] P00112_A5301Inc_BarPar ;
   private byte[] P00112_A5300Inc_BarReo ;
   private int[] P00112_A5299Inc_Barcod ;
   private GXBaseCollection<app.SdtSDTIncidencias> Gxm2rootcol ;
   private app.SdtSDTIncidencias Gxm1sdtincidencias ;
}

final  class dpincidencias__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00112", "SELECT Inc_Prog, Inc_Dia, EmprCod, Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Linea, Inc_BarPar, Inc_BarReo, Inc_Barcod FROM TXPCRTIN1 WHERE (EmprCod = ? and Inc_Dia >= ?) AND (Inc_Prog like ? or (rtrim(?) IS NULL)) AND (Inc_Barcod = ? or (? = 0)) AND (Inc_BarReo = ? or (? = 0)) AND (Inc_BarPar = ? or (rtrim(?) IS NULL)) AND (Inc_Dia <= ?) ORDER BY EmprCod, Inc_Dia, Inc_Linea ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(4));
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setDate(11, (java.util.Date)parms[10]);
               return;
      }
   }

}

