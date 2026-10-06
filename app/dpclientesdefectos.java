package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpclientesdefectos extends GXProcedure
{
   public dpclientesdefectos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpclientesdefectos.class ), "" );
   }

   public dpclientesdefectos( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTClientesDefectos> executeUdp( String aP0 ,
                                                                   java.util.Date aP1 ,
                                                                   java.util.Date aP2 ,
                                                                   int aP3 ,
                                                                   int aP4 ,
                                                                   byte aP5 )
   {
      dpclientesdefectos.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTClientesDefectos>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        int aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        GXBaseCollection<app.SdtSDTClientesDefectos>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             GXBaseCollection<app.SdtSDTClientesDefectos>[] aP6 )
   {
      dpclientesdefectos.this.AV12Emprcod = aP0;
      dpclientesdefectos.this.AV8FechaIni = aP1;
      dpclientesdefectos.this.AV7FechaFin = aP2;
      dpclientesdefectos.this.AV6ClicodIni = aP3;
      dpclientesdefectos.this.AV5ClicodFin = aP4;
      dpclientesdefectos.this.AV9HisEstReo = aP5;
      dpclientesdefectos.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00122 */
      pr_default.execute(0, new Object[] {AV12Emprcod, Integer.valueOf(AV6ClicodIni), AV8FechaIni, AV7FechaFin, Byte.valueOf(AV9HisEstReo), Integer.valueOf(AV5ClicodFin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk122 = false ;
         A540HisBarKgm = P00122_A540HisBarKgm[0] ;
         n540HisBarKgm = P00122_n540HisBarKgm[0] ;
         A541HisBarMtr = P00122_A541HisBarMtr[0] ;
         n541HisBarMtr = P00122_n541HisBarMtr[0] ;
         A252CliCod = P00122_A252CliCod[0] ;
         n252CliCod = P00122_n252CliCod[0] ;
         A396EmprCod = P00122_A396EmprCod[0] ;
         A834TipDefDsc = P00122_A834TipDefDsc[0] ;
         n834TipDefDsc = P00122_n834TipDefDsc[0] ;
         A833TipDefCod = P00122_A833TipDefCod[0] ;
         A548HisEstReo = P00122_A548HisEstReo[0] ;
         n548HisEstReo = P00122_n548HisEstReo[0] ;
         A569HisReoFec = P00122_A569HisReoFec[0] ;
         n569HisReoFec = P00122_n569HisReoFec[0] ;
         A279CliNom = P00122_A279CliNom[0] ;
         A539HisBarCod = P00122_A539HisBarCod[0] ;
         A545HisCodReo = P00122_A545HisCodReo[0] ;
         A544HisCodPar = P00122_A544HisCodPar[0] ;
         A279CliNom = P00122_A279CliNom[0] ;
         A834TipDefDsc = P00122_A834TipDefDsc[0] ;
         n834TipDefDsc = P00122_n834TipDefDsc[0] ;
         Gxm1sdtclientesdefectos = (app.SdtSDTClientesDefectos)new app.SdtSDTClientesDefectos(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtclientesdefectos, 0);
         Gxm1sdtclientesdefectos.setgxTv_SdtSDTClientesDefectos_Clinom( A279CliNom );
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P00122_A396EmprCod[0], A396EmprCod) == 0 ) && ( P00122_A252CliCod[0] == A252CliCod ) )
         {
            brk122 = false ;
            A540HisBarKgm = P00122_A540HisBarKgm[0] ;
            n540HisBarKgm = P00122_n540HisBarKgm[0] ;
            A541HisBarMtr = P00122_A541HisBarMtr[0] ;
            n541HisBarMtr = P00122_n541HisBarMtr[0] ;
            A834TipDefDsc = P00122_A834TipDefDsc[0] ;
            n834TipDefDsc = P00122_n834TipDefDsc[0] ;
            A833TipDefCod = P00122_A833TipDefCod[0] ;
            A539HisBarCod = P00122_A539HisBarCod[0] ;
            A545HisCodReo = P00122_A545HisCodReo[0] ;
            A544HisCodPar = P00122_A544HisCodPar[0] ;
            A834TipDefDsc = P00122_A834TipDefDsc[0] ;
            n834TipDefDsc = P00122_n834TipDefDsc[0] ;
            Gxm3sdtclientesdefectos_defectos = (app.SdtSDTClientesDefectos_DefectosItem)new app.SdtSDTClientesDefectos_DefectosItem(remoteHandle, context);
            Gxm1sdtclientesdefectos.getgxTv_SdtSDTClientesDefectos_Defectos().add(Gxm3sdtclientesdefectos_defectos, 0);
            Gxm3sdtclientesdefectos_defectos.setgxTv_SdtSDTClientesDefectos_DefectosItem_Tipdefdsc( A834TipDefDsc );
            AV10kilos = DecimalUtil.doubleToDec(0) ;
            AV11metros = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P00122_A396EmprCod[0], A396EmprCod) == 0 ) && ( P00122_A252CliCod[0] == A252CliCod ) && ( P00122_A833TipDefCod[0] == A833TipDefCod ) )
            {
               brk122 = false ;
               A540HisBarKgm = P00122_A540HisBarKgm[0] ;
               n540HisBarKgm = P00122_n540HisBarKgm[0] ;
               A541HisBarMtr = P00122_A541HisBarMtr[0] ;
               n541HisBarMtr = P00122_n541HisBarMtr[0] ;
               A539HisBarCod = P00122_A539HisBarCod[0] ;
               A545HisCodReo = P00122_A545HisCodReo[0] ;
               A544HisCodPar = P00122_A544HisCodPar[0] ;
               AV10kilos = AV10kilos.add(A540HisBarKgm) ;
               AV11metros = AV11metros.add(A541HisBarMtr) ;
               brk122 = true ;
               pr_default.readNext(0);
            }
            Gxm3sdtclientesdefectos_defectos.setgxTv_SdtSDTClientesDefectos_DefectosItem_Kilosdefecto( AV10kilos );
            Gxm3sdtclientesdefectos_defectos.setgxTv_SdtSDTClientesDefectos_DefectosItem_Metrosdefecto( AV11metros );
            if ( ! brk122 )
            {
               brk122 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk122 )
         {
            brk122 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = dpclientesdefectos.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(0);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTClientesDefectos>(app.SdtSDTClientesDefectos.class, "SDTClientesDefectos", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00122_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00122_n540HisBarKgm = new boolean[] {false} ;
      P00122_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00122_n541HisBarMtr = new boolean[] {false} ;
      P00122_A252CliCod = new int[1] ;
      P00122_n252CliCod = new boolean[] {false} ;
      P00122_A396EmprCod = new String[] {""} ;
      P00122_A834TipDefDsc = new String[] {""} ;
      P00122_n834TipDefDsc = new boolean[] {false} ;
      P00122_A833TipDefCod = new short[1] ;
      P00122_A548HisEstReo = new byte[1] ;
      P00122_n548HisEstReo = new boolean[] {false} ;
      P00122_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00122_n569HisReoFec = new boolean[] {false} ;
      P00122_A279CliNom = new String[] {""} ;
      P00122_A539HisBarCod = new int[1] ;
      P00122_A545HisCodReo = new byte[1] ;
      P00122_A544HisCodPar = new String[] {""} ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A834TipDefDsc = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A544HisCodPar = "" ;
      Gxm1sdtclientesdefectos = new app.SdtSDTClientesDefectos(remoteHandle, context);
      Gxm3sdtclientesdefectos_defectos = new app.SdtSDTClientesDefectos_DefectosItem(remoteHandle, context);
      AV10kilos = DecimalUtil.ZERO ;
      AV11metros = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpclientesdefectos__default(),
         new Object[] {
             new Object[] {
            P00122_A540HisBarKgm, P00122_n540HisBarKgm, P00122_A541HisBarMtr, P00122_n541HisBarMtr, P00122_A252CliCod, P00122_n252CliCod, P00122_A396EmprCod, P00122_A834TipDefDsc, P00122_n834TipDefDsc, P00122_A833TipDefCod,
            P00122_A548HisEstReo, P00122_n548HisEstReo, P00122_A569HisReoFec, P00122_n569HisReoFec, P00122_A279CliNom, P00122_A539HisBarCod, P00122_A545HisCodReo, P00122_A544HisCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9HisEstReo ;
   private byte A548HisEstReo ;
   private byte A545HisCodReo ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private int AV6ClicodIni ;
   private int AV5ClicodFin ;
   private int A252CliCod ;
   private int A539HisBarCod ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal AV10kilos ;
   private java.math.BigDecimal AV11metros ;
   private String AV12Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A834TipDefDsc ;
   private String A279CliNom ;
   private String A544HisCodPar ;
   private java.util.Date AV8FechaIni ;
   private java.util.Date AV7FechaFin ;
   private java.util.Date A569HisReoFec ;
   private boolean brk122 ;
   private boolean n540HisBarKgm ;
   private boolean n541HisBarMtr ;
   private boolean n252CliCod ;
   private boolean n834TipDefDsc ;
   private boolean n548HisEstReo ;
   private boolean n569HisReoFec ;
   private GXBaseCollection<app.SdtSDTClientesDefectos>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P00122_A540HisBarKgm ;
   private boolean[] P00122_n540HisBarKgm ;
   private java.math.BigDecimal[] P00122_A541HisBarMtr ;
   private boolean[] P00122_n541HisBarMtr ;
   private int[] P00122_A252CliCod ;
   private boolean[] P00122_n252CliCod ;
   private String[] P00122_A396EmprCod ;
   private String[] P00122_A834TipDefDsc ;
   private boolean[] P00122_n834TipDefDsc ;
   private short[] P00122_A833TipDefCod ;
   private byte[] P00122_A548HisEstReo ;
   private boolean[] P00122_n548HisEstReo ;
   private java.util.Date[] P00122_A569HisReoFec ;
   private boolean[] P00122_n569HisReoFec ;
   private String[] P00122_A279CliNom ;
   private int[] P00122_A539HisBarCod ;
   private byte[] P00122_A545HisCodReo ;
   private String[] P00122_A544HisCodPar ;
   private GXBaseCollection<app.SdtSDTClientesDefectos> Gxm2rootcol ;
   private app.SdtSDTClientesDefectos Gxm1sdtclientesdefectos ;
   private app.SdtSDTClientesDefectos_DefectosItem Gxm3sdtclientesdefectos_defectos ;
}

final  class dpclientesdefectos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00122", "SELECT T1.HisBarKgm, T1.HisBarMtr, T1.CliCod, T1.EmprCod, T3.TipDefDsc, T1.TipDefCod, T1.HisEstReo, T1.HisReoFec, T2.CliNom, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar FROM ((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPDEF T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDefCod = T1.TipDefCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ?) AND (T1.HisReoFec >= ?) AND (T1.HisReoFec <= ?) AND (T1.HisEstReo = ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

