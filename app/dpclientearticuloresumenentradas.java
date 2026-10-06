package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpclientearticuloresumenentradas extends GXProcedure
{
   public dpclientearticuloresumenentradas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpclientearticuloresumenentradas.class ), "" );
   }

   public dpclientearticuloresumenentradas( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas> executeUdp( String aP0 ,
                                                                                 int aP1 ,
                                                                                 int aP2 ,
                                                                                 java.util.Date aP3 ,
                                                                                 java.util.Date aP4 ,
                                                                                 String aP5 ,
                                                                                 String aP6 ,
                                                                                 byte aP7 )
   {
      dpclientearticuloresumenentradas.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        String aP5 ,
                        String aP6 ,
                        byte aP7 ,
                        GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas>[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             String aP6 ,
                             byte aP7 ,
                             GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas>[] aP8 )
   {
      dpclientearticuloresumenentradas.this.AV9Emprcod = aP0;
      dpclientearticuloresumenentradas.this.AV10ClienteInicial = aP1;
      dpclientearticuloresumenentradas.this.AV11ClienteFinal = aP2;
      dpclientearticuloresumenentradas.this.AV12FechaInicial = aP3;
      dpclientearticuloresumenentradas.this.AV13FechaFinal = aP4;
      dpclientearticuloresumenentradas.this.AV14ArticuloInicial = aP5;
      dpclientearticuloresumenentradas.this.AV15ArticuloFinal = aP6;
      dpclientearticuloresumenentradas.this.AV16Albrest = aP7;
      dpclientearticuloresumenentradas.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00162 */
      pr_default.execute(0, new Object[] {AV9Emprcod, Integer.valueOf(AV10ClienteInicial), AV14ArticuloInicial, AV15ArticuloFinal, AV12FechaInicial, AV13FechaFinal, Byte.valueOf(AV16Albrest), Byte.valueOf(AV16Albrest), Integer.valueOf(AV11ClienteFinal)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk162 = false ;
         A58AlbRUniEnt = P00162_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = P00162_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P00162_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P00162_A54AlbRPieUti[0] ;
         A252CliCod = P00162_A252CliCod[0] ;
         A396EmprCod = P00162_A396EmprCod[0] ;
         A45AlbRef = P00162_A45AlbRef[0] ;
         A3613AlbRefDsc = P00162_A3613AlbRefDsc[0] ;
         A56AlbRUni = P00162_A56AlbRUni[0] ;
         A47AlbREst = P00162_A47AlbREst[0] ;
         A49AlbRFen = P00162_A49AlbRFen[0] ;
         A279CliNom = P00162_A279CliNom[0] ;
         A44AlbRecCod = P00162_A44AlbRecCod[0] ;
         A279CliNom = P00162_A279CliNom[0] ;
         Gxm1sdtclientearticuloresumenentradas = (app.SdtSDTClienteArticuloResumenEntradas)new app.SdtSDTClienteArticuloResumenEntradas(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtclientearticuloresumenentradas, 0);
         Gxm1sdtclientearticuloresumenentradas.setgxTv_SdtSDTClienteArticuloResumenEntradas_Clicod( A252CliCod );
         Gxm1sdtclientearticuloresumenentradas.setgxTv_SdtSDTClienteArticuloResumenEntradas_Clinom( A279CliNom );
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P00162_A396EmprCod[0], A396EmprCod) == 0 ) && ( P00162_A252CliCod[0] == A252CliCod ) )
         {
            brk162 = false ;
            A58AlbRUniEnt = P00162_A58AlbRUniEnt[0] ;
            A52AlbRPieEnt = P00162_A52AlbRPieEnt[0] ;
            A60AlbRUniUti = P00162_A60AlbRUniUti[0] ;
            A54AlbRPieUti = P00162_A54AlbRPieUti[0] ;
            A45AlbRef = P00162_A45AlbRef[0] ;
            A3613AlbRefDsc = P00162_A3613AlbRefDsc[0] ;
            A56AlbRUni = P00162_A56AlbRUni[0] ;
            A44AlbRecCod = P00162_A44AlbRecCod[0] ;
            Gxm3sdtclientearticuloresumenentradas_articulos = (app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem)new app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem(remoteHandle, context);
            Gxm1sdtclientearticuloresumenentradas.getgxTv_SdtSDTClienteArticuloResumenEntradas_Articulos().add(Gxm3sdtclientearticuloresumenentradas_articulos, 0);
            Gxm3sdtclientearticuloresumenentradas_articulos.setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albref( A45AlbRef );
            Gxm3sdtclientearticuloresumenentradas_articulos.setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albrefdsc( A3613AlbRefDsc );
            Gxm3sdtclientearticuloresumenentradas_articulos.setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Albruni( A56AlbRUni );
            AV5UndEnt = DecimalUtil.doubleToDec(0) ;
            AV6PzsEnt = 0 ;
            AV7UndUti = DecimalUtil.doubleToDec(0) ;
            AV8PzsUti = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P00162_A396EmprCod[0], A396EmprCod) == 0 ) && ( P00162_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P00162_A45AlbRef[0], A45AlbRef) == 0 ) )
            {
               brk162 = false ;
               A58AlbRUniEnt = P00162_A58AlbRUniEnt[0] ;
               A52AlbRPieEnt = P00162_A52AlbRPieEnt[0] ;
               A60AlbRUniUti = P00162_A60AlbRUniUti[0] ;
               A54AlbRPieUti = P00162_A54AlbRPieUti[0] ;
               A44AlbRecCod = P00162_A44AlbRecCod[0] ;
               AV5UndEnt = AV5UndEnt.add(A58AlbRUniEnt) ;
               AV6PzsEnt = (int)(AV6PzsEnt+A52AlbRPieEnt) ;
               AV7UndUti = AV7UndUti.add(A60AlbRUniUti) ;
               AV8PzsUti = (int)(AV8PzsUti+A54AlbRPieUti) ;
               brk162 = true ;
               pr_default.readNext(0);
            }
            Gxm3sdtclientearticuloresumenentradas_articulos.setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undent( AV5UndEnt );
            Gxm3sdtclientearticuloresumenentradas_articulos.setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsent( AV6PzsEnt );
            Gxm3sdtclientearticuloresumenentradas_articulos.setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Unduti( AV7UndUti );
            Gxm3sdtclientearticuloresumenentradas_articulos.setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsuti( AV8PzsUti );
            Gxm3sdtclientearticuloresumenentradas_articulos.setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Undstk( AV5UndEnt.subtract(AV7UndUti) );
            Gxm3sdtclientearticuloresumenentradas_articulos.setgxTv_SdtSDTClienteArticuloResumenEntradas_ArticulosItem_Pzsstk( (int)(AV6PzsEnt-AV8PzsUti) );
            if ( ! brk162 )
            {
               brk162 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk162 )
         {
            brk162 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = dpclientearticuloresumenentradas.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas>(app.SdtSDTClienteArticuloResumenEntradas.class, "SDTClienteArticuloResumenEntradas", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00162_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00162_A52AlbRPieEnt = new int[1] ;
      P00162_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00162_A54AlbRPieUti = new int[1] ;
      P00162_A252CliCod = new int[1] ;
      P00162_A396EmprCod = new String[] {""} ;
      P00162_A45AlbRef = new String[] {""} ;
      P00162_A3613AlbRefDsc = new String[] {""} ;
      P00162_A56AlbRUni = new String[] {""} ;
      P00162_A47AlbREst = new byte[1] ;
      P00162_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P00162_A279CliNom = new String[] {""} ;
      P00162_A44AlbRecCod = new int[1] ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A56AlbRUni = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A279CliNom = "" ;
      Gxm1sdtclientearticuloresumenentradas = new app.SdtSDTClienteArticuloResumenEntradas(remoteHandle, context);
      Gxm3sdtclientearticuloresumenentradas_articulos = new app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem(remoteHandle, context);
      AV5UndEnt = DecimalUtil.ZERO ;
      AV7UndUti = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpclientearticuloresumenentradas__default(),
         new Object[] {
             new Object[] {
            P00162_A58AlbRUniEnt, P00162_A52AlbRPieEnt, P00162_A60AlbRUniUti, P00162_A54AlbRPieUti, P00162_A252CliCod, P00162_A396EmprCod, P00162_A45AlbRef, P00162_A3613AlbRefDsc, P00162_A56AlbRUni, P00162_A47AlbREst,
            P00162_A49AlbRFen, P00162_A279CliNom, P00162_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Albrest ;
   private byte A47AlbREst ;
   private short Gx_err ;
   private int AV10ClienteInicial ;
   private int AV11ClienteFinal ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int AV6PzsEnt ;
   private int AV8PzsUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV5UndEnt ;
   private java.math.BigDecimal AV7UndUti ;
   private String AV9Emprcod ;
   private String AV14ArticuloInicial ;
   private String AV15ArticuloFinal ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A56AlbRUni ;
   private String A279CliNom ;
   private java.util.Date AV12FechaInicial ;
   private java.util.Date AV13FechaFinal ;
   private java.util.Date A49AlbRFen ;
   private boolean brk162 ;
   private GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas>[] aP8 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P00162_A58AlbRUniEnt ;
   private int[] P00162_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P00162_A60AlbRUniUti ;
   private int[] P00162_A54AlbRPieUti ;
   private int[] P00162_A252CliCod ;
   private String[] P00162_A396EmprCod ;
   private String[] P00162_A45AlbRef ;
   private String[] P00162_A3613AlbRefDsc ;
   private String[] P00162_A56AlbRUni ;
   private byte[] P00162_A47AlbREst ;
   private java.util.Date[] P00162_A49AlbRFen ;
   private String[] P00162_A279CliNom ;
   private int[] P00162_A44AlbRecCod ;
   private GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas> Gxm2rootcol ;
   private app.SdtSDTClienteArticuloResumenEntradas Gxm1sdtclientearticuloresumenentradas ;
   private app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem Gxm3sdtclientearticuloresumenentradas_articulos ;
}

final  class dpclientearticuloresumenentradas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00162", "SELECT T1.AlbRUniEnt, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRPieUti, T1.CliCod, T1.EmprCod, T1.AlbRef, T1.AlbRefDsc, T1.AlbRUni, T1.AlbREst, T1.AlbRFen, T2.CliNom, T1.AlbRecCod FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.AlbRef >= ?) AND (T1.AlbRef <= ?) AND (T1.AlbRFen >= ?) AND (T1.AlbRFen <= ?) AND (T1.AlbREst = ? or ? = 9) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.AlbRef ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
      }
   }

}

