package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpclientesdefectosmaquinas extends GXProcedure
{
   public dpclientesdefectosmaquinas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpclientesdefectosmaquinas.class ), "" );
   }

   public dpclientesdefectosmaquinas( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTClientesDefectosMaquinas> executeUdp( String aP0 ,
                                                                           java.util.Date aP1 ,
                                                                           java.util.Date aP2 ,
                                                                           int aP3 ,
                                                                           int aP4 ,
                                                                           byte aP5 )
   {
      dpclientesdefectosmaquinas.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTClientesDefectosMaquinas>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        int aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        GXBaseCollection<app.SdtSDTClientesDefectosMaquinas>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             GXBaseCollection<app.SdtSDTClientesDefectosMaquinas>[] aP6 )
   {
      dpclientesdefectosmaquinas.this.AV5Emprcod = aP0;
      dpclientesdefectosmaquinas.this.AV11FechaIni = aP1;
      dpclientesdefectosmaquinas.this.AV10FechaFin = aP2;
      dpclientesdefectosmaquinas.this.AV8ClicodIni = aP3;
      dpclientesdefectosmaquinas.this.AV7ClicodFin = aP4;
      dpclientesdefectosmaquinas.this.AV6HisEstReo = aP5;
      dpclientesdefectosmaquinas.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000T2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV8ClicodIni), AV11FechaIni, AV10FechaFin, Byte.valueOf(AV6HisEstReo), Integer.valueOf(AV7ClicodFin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk0T2 = false ;
         A540HisBarKgm = P000T2_A540HisBarKgm[0] ;
         n540HisBarKgm = P000T2_n540HisBarKgm[0] ;
         A541HisBarMtr = P000T2_A541HisBarMtr[0] ;
         n541HisBarMtr = P000T2_n541HisBarMtr[0] ;
         A834TipDefDsc = P000T2_A834TipDefDsc[0] ;
         n834TipDefDsc = P000T2_n834TipDefDsc[0] ;
         A833TipDefCod = P000T2_A833TipDefCod[0] ;
         A252CliCod = P000T2_A252CliCod[0] ;
         n252CliCod = P000T2_n252CliCod[0] ;
         A396EmprCod = P000T2_A396EmprCod[0] ;
         A606MaqDsc = P000T2_A606MaqDsc[0] ;
         n606MaqDsc = P000T2_n606MaqDsc[0] ;
         A602MaqCod = P000T2_A602MaqCod[0] ;
         n602MaqCod = P000T2_n602MaqCod[0] ;
         A548HisEstReo = P000T2_A548HisEstReo[0] ;
         n548HisEstReo = P000T2_n548HisEstReo[0] ;
         A569HisReoFec = P000T2_A569HisReoFec[0] ;
         n569HisReoFec = P000T2_n569HisReoFec[0] ;
         A279CliNom = P000T2_A279CliNom[0] ;
         A539HisBarCod = P000T2_A539HisBarCod[0] ;
         A545HisCodReo = P000T2_A545HisCodReo[0] ;
         A544HisCodPar = P000T2_A544HisCodPar[0] ;
         A279CliNom = P000T2_A279CliNom[0] ;
         A834TipDefDsc = P000T2_A834TipDefDsc[0] ;
         n834TipDefDsc = P000T2_n834TipDefDsc[0] ;
         A606MaqDsc = P000T2_A606MaqDsc[0] ;
         n606MaqDsc = P000T2_n606MaqDsc[0] ;
         Gxm1sdtclientesdefectosmaquinas = (app.SdtSDTClientesDefectosMaquinas)new app.SdtSDTClientesDefectosMaquinas(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtclientesdefectosmaquinas, 0);
         Gxm1sdtclientesdefectosmaquinas.setgxTv_SdtSDTClientesDefectosMaquinas_Clinom( A279CliNom );
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P000T2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P000T2_A252CliCod[0] == A252CliCod ) )
         {
            brk0T2 = false ;
            A540HisBarKgm = P000T2_A540HisBarKgm[0] ;
            n540HisBarKgm = P000T2_n540HisBarKgm[0] ;
            A541HisBarMtr = P000T2_A541HisBarMtr[0] ;
            n541HisBarMtr = P000T2_n541HisBarMtr[0] ;
            A834TipDefDsc = P000T2_A834TipDefDsc[0] ;
            n834TipDefDsc = P000T2_n834TipDefDsc[0] ;
            A833TipDefCod = P000T2_A833TipDefCod[0] ;
            A606MaqDsc = P000T2_A606MaqDsc[0] ;
            n606MaqDsc = P000T2_n606MaqDsc[0] ;
            A602MaqCod = P000T2_A602MaqCod[0] ;
            n602MaqCod = P000T2_n602MaqCod[0] ;
            A539HisBarCod = P000T2_A539HisBarCod[0] ;
            A545HisCodReo = P000T2_A545HisCodReo[0] ;
            A544HisCodPar = P000T2_A544HisCodPar[0] ;
            A834TipDefDsc = P000T2_A834TipDefDsc[0] ;
            n834TipDefDsc = P000T2_n834TipDefDsc[0] ;
            A606MaqDsc = P000T2_A606MaqDsc[0] ;
            n606MaqDsc = P000T2_n606MaqDsc[0] ;
            Gxm3sdtclientesdefectosmaquinas_maq = (app.SdtSDTClientesDefectosMaquinas_MaqItem)new app.SdtSDTClientesDefectosMaquinas_MaqItem(remoteHandle, context);
            Gxm1sdtclientesdefectosmaquinas.getgxTv_SdtSDTClientesDefectosMaquinas_Maq().add(Gxm3sdtclientesdefectosmaquinas_maq, 0);
            Gxm3sdtclientesdefectosmaquinas_maq.setgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc( A606MaqDsc );
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P000T2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P000T2_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P000T2_A602MaqCod[0], A602MaqCod) == 0 ) )
            {
               brk0T2 = false ;
               A540HisBarKgm = P000T2_A540HisBarKgm[0] ;
               n540HisBarKgm = P000T2_n540HisBarKgm[0] ;
               A541HisBarMtr = P000T2_A541HisBarMtr[0] ;
               n541HisBarMtr = P000T2_n541HisBarMtr[0] ;
               A834TipDefDsc = P000T2_A834TipDefDsc[0] ;
               n834TipDefDsc = P000T2_n834TipDefDsc[0] ;
               A833TipDefCod = P000T2_A833TipDefCod[0] ;
               A539HisBarCod = P000T2_A539HisBarCod[0] ;
               A545HisCodReo = P000T2_A545HisCodReo[0] ;
               A544HisCodPar = P000T2_A544HisCodPar[0] ;
               A834TipDefDsc = P000T2_A834TipDefDsc[0] ;
               n834TipDefDsc = P000T2_n834TipDefDsc[0] ;
               Gxm4sdtclientesdefectosmaquinas_maq_def = (app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem)new app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem(remoteHandle, context);
               Gxm3sdtclientesdefectosmaquinas_maq.getgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def().add(Gxm4sdtclientesdefectosmaquinas_maq_def, 0);
               Gxm4sdtclientesdefectosmaquinas_maq_def.setgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Tipdefdsc( A834TipDefDsc );
               AV13kilos = DecimalUtil.doubleToDec(0) ;
               AV14metros = DecimalUtil.doubleToDec(0) ;
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P000T2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P000T2_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P000T2_A602MaqCod[0], A602MaqCod) == 0 ) && ( P000T2_A833TipDefCod[0] == A833TipDefCod ) )
               {
                  brk0T2 = false ;
                  A540HisBarKgm = P000T2_A540HisBarKgm[0] ;
                  n540HisBarKgm = P000T2_n540HisBarKgm[0] ;
                  A541HisBarMtr = P000T2_A541HisBarMtr[0] ;
                  n541HisBarMtr = P000T2_n541HisBarMtr[0] ;
                  A539HisBarCod = P000T2_A539HisBarCod[0] ;
                  A545HisCodReo = P000T2_A545HisCodReo[0] ;
                  A544HisCodPar = P000T2_A544HisCodPar[0] ;
                  AV13kilos = AV13kilos.add(A540HisBarKgm) ;
                  AV14metros = AV14metros.add(A541HisBarMtr) ;
                  brk0T2 = true ;
                  pr_default.readNext(0);
               }
               Gxm4sdtclientesdefectosmaquinas_maq_def.setgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Kilosdefecto( AV13kilos );
               Gxm4sdtclientesdefectosmaquinas_maq_def.setgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_DefItem_Metrosdefecto( AV14metros );
               if ( ! brk0T2 )
               {
                  brk0T2 = true ;
                  pr_default.readNext(0);
               }
            }
            if ( ! brk0T2 )
            {
               brk0T2 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk0T2 )
         {
            brk0T2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = dpclientesdefectosmaquinas.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTClientesDefectosMaquinas>(app.SdtSDTClientesDefectosMaquinas.class, "SDTClientesDefectosMaquinas", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P000T2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000T2_n540HisBarKgm = new boolean[] {false} ;
      P000T2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000T2_n541HisBarMtr = new boolean[] {false} ;
      P000T2_A834TipDefDsc = new String[] {""} ;
      P000T2_n834TipDefDsc = new boolean[] {false} ;
      P000T2_A833TipDefCod = new short[1] ;
      P000T2_A252CliCod = new int[1] ;
      P000T2_n252CliCod = new boolean[] {false} ;
      P000T2_A396EmprCod = new String[] {""} ;
      P000T2_A606MaqDsc = new String[] {""} ;
      P000T2_n606MaqDsc = new boolean[] {false} ;
      P000T2_A602MaqCod = new String[] {""} ;
      P000T2_n602MaqCod = new boolean[] {false} ;
      P000T2_A548HisEstReo = new byte[1] ;
      P000T2_n548HisEstReo = new boolean[] {false} ;
      P000T2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P000T2_n569HisReoFec = new boolean[] {false} ;
      P000T2_A279CliNom = new String[] {""} ;
      P000T2_A539HisBarCod = new int[1] ;
      P000T2_A545HisCodReo = new byte[1] ;
      P000T2_A544HisCodPar = new String[] {""} ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A834TipDefDsc = "" ;
      A396EmprCod = "" ;
      A606MaqDsc = "" ;
      A602MaqCod = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A544HisCodPar = "" ;
      Gxm1sdtclientesdefectosmaquinas = new app.SdtSDTClientesDefectosMaquinas(remoteHandle, context);
      Gxm3sdtclientesdefectosmaquinas_maq = new app.SdtSDTClientesDefectosMaquinas_MaqItem(remoteHandle, context);
      Gxm4sdtclientesdefectosmaquinas_maq_def = new app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem(remoteHandle, context);
      AV13kilos = DecimalUtil.ZERO ;
      AV14metros = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpclientesdefectosmaquinas__default(),
         new Object[] {
             new Object[] {
            P000T2_A540HisBarKgm, P000T2_n540HisBarKgm, P000T2_A541HisBarMtr, P000T2_n541HisBarMtr, P000T2_A834TipDefDsc, P000T2_n834TipDefDsc, P000T2_A833TipDefCod, P000T2_A252CliCod, P000T2_n252CliCod, P000T2_A396EmprCod,
            P000T2_A606MaqDsc, P000T2_n606MaqDsc, P000T2_A602MaqCod, P000T2_n602MaqCod, P000T2_A548HisEstReo, P000T2_n548HisEstReo, P000T2_A569HisReoFec, P000T2_n569HisReoFec, P000T2_A279CliNom, P000T2_A539HisBarCod,
            P000T2_A545HisCodReo, P000T2_A544HisCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV6HisEstReo ;
   private byte A548HisEstReo ;
   private byte A545HisCodReo ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private int AV8ClicodIni ;
   private int AV7ClicodFin ;
   private int A252CliCod ;
   private int A539HisBarCod ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal AV13kilos ;
   private java.math.BigDecimal AV14metros ;
   private String AV5Emprcod ;
   private String scmdbuf ;
   private String A834TipDefDsc ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private String A602MaqCod ;
   private String A279CliNom ;
   private String A544HisCodPar ;
   private java.util.Date AV11FechaIni ;
   private java.util.Date AV10FechaFin ;
   private java.util.Date A569HisReoFec ;
   private boolean brk0T2 ;
   private boolean n540HisBarKgm ;
   private boolean n541HisBarMtr ;
   private boolean n834TipDefDsc ;
   private boolean n252CliCod ;
   private boolean n606MaqDsc ;
   private boolean n602MaqCod ;
   private boolean n548HisEstReo ;
   private boolean n569HisReoFec ;
   private GXBaseCollection<app.SdtSDTClientesDefectosMaquinas>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P000T2_A540HisBarKgm ;
   private boolean[] P000T2_n540HisBarKgm ;
   private java.math.BigDecimal[] P000T2_A541HisBarMtr ;
   private boolean[] P000T2_n541HisBarMtr ;
   private String[] P000T2_A834TipDefDsc ;
   private boolean[] P000T2_n834TipDefDsc ;
   private short[] P000T2_A833TipDefCod ;
   private int[] P000T2_A252CliCod ;
   private boolean[] P000T2_n252CliCod ;
   private String[] P000T2_A396EmprCod ;
   private String[] P000T2_A606MaqDsc ;
   private boolean[] P000T2_n606MaqDsc ;
   private String[] P000T2_A602MaqCod ;
   private boolean[] P000T2_n602MaqCod ;
   private byte[] P000T2_A548HisEstReo ;
   private boolean[] P000T2_n548HisEstReo ;
   private java.util.Date[] P000T2_A569HisReoFec ;
   private boolean[] P000T2_n569HisReoFec ;
   private String[] P000T2_A279CliNom ;
   private int[] P000T2_A539HisBarCod ;
   private byte[] P000T2_A545HisCodReo ;
   private String[] P000T2_A544HisCodPar ;
   private GXBaseCollection<app.SdtSDTClientesDefectosMaquinas> Gxm2rootcol ;
   private app.SdtSDTClientesDefectosMaquinas Gxm1sdtclientesdefectosmaquinas ;
   private app.SdtSDTClientesDefectosMaquinas_MaqItem Gxm3sdtclientesdefectosmaquinas_maq ;
   private app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem Gxm4sdtclientesdefectosmaquinas_maq_def ;
}

final  class dpclientesdefectosmaquinas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000T2", "SELECT T1.HisBarKgm, T1.HisBarMtr, T3.TipDefDsc, T1.TipDefCod, T1.CliCod, T1.EmprCod, T4.MaqDsc, T1.MaqCod, T1.HisEstReo, T1.HisReoFec, T2.CliNom, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar FROM (((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPDEF T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDefCod = T1.TipDefCod) LEFT JOIN TXPMAQUIN T4 ON T4.EmprCod = T1.EmprCod AND T4.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ?) AND (T1.HisReoFec >= ?) AND (T1.HisReoFec <= ?) AND (T1.HisEstReo = ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.MaqCod, T1.TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((String[]) buf[10])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 30);
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((byte[]) buf[20])[0] = rslt.getByte(13);
               ((String[]) buf[21])[0] = rslt.getString(14, 1);
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

