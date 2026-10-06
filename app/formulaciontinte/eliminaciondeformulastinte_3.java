package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class eliminaciondeformulastinte_3 extends GXProcedure
{
   public eliminaciondeformulastinte_3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( eliminaciondeformulastinte_3.class ), "" );
   }

   public eliminaciondeformulastinte_3( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        int aP6 ,
                        String aP7 ,
                        String aP8 ,
                        String aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             int aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 )
   {
      eliminaciondeformulastinte_3.this.AV11Emprcod = aP0;
      eliminaciondeformulastinte_3.this.AV8Clicod = aP1;
      eliminaciondeformulastinte_3.this.AV16Forser = aP2;
      eliminaciondeformulastinte_3.this.AV12Forcolnom = aP3;
      eliminaciondeformulastinte_3.this.AV14Forcolnum = aP4;
      eliminaciondeformulastinte_3.this.AV25TipColCod = aP5;
      eliminaciondeformulastinte_3.this.AV37fornumcol = aP6;
      eliminaciondeformulastinte_3.this.AV27Usurcod = aP7;
      eliminaciondeformulastinte_3.this.AV23Station = aP8;
      eliminaciondeformulastinte_3.this.AV38Provisional = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33formulas = 0 ;
      AV35formulasnoeliminadas = (short)(0) ;
      /* Using cursor P09WH2 */
      pr_default.execute(0, new Object[] {AV11Emprcod, Integer.valueOf(AV8Clicod), AV16Forser, AV12Forcolnom, Integer.valueOf(AV14Forcolnum), Byte.valueOf(AV25TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P09WH2_A831TipColCod[0] ;
         A483ForColNum = P09WH2_A483ForColNum[0] ;
         A482ForColNom = P09WH2_A482ForColNom[0] ;
         A494ForSer = P09WH2_A494ForSer[0] ;
         A252CliCod = P09WH2_A252CliCod[0] ;
         A396EmprCod = P09WH2_A396EmprCod[0] ;
         A486ForNumCol = P09WH2_A486ForNumCol[0] ;
         A496ForUltUti = P09WH2_A496ForUltUti[0] ;
         n496ForUltUti = P09WH2_n496ForUltUti[0] ;
         A2749ForPro = P09WH2_A2749ForPro[0] ;
         n2749ForPro = P09WH2_n2749ForPro[0] ;
         /* Using cursor P09WH3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         AV21Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV21Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( ((GXutil.strcmp(AV38Provisional, "S")==0) ? httpContext.getMessage( "DLT, Formula Teñido Provisional.", "") : httpContext.getMessage( "DLT, Formula Teñido.", "")) );
         AV21Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV21Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Cliente = ", "")+GXutil.str( A252CliCod, 6, 0) );
         AV21Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV21Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Artículo= ", "")+GXutil.trim( A494ForSer) );
         AV21Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV21Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Color   = ", "")+GXutil.trim( A482ForColNom) );
         AV21Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV21Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Numero  = ", "")+GXutil.trim( GXutil.str( A483ForColNum, 6, 0)) );
         AV21Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV21Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Tc      = ", "")+GXutil.trim( GXutil.str( A831TipColCod, 2, 0)) );
         AV21Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV21Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Nº formula = ", "")+GXutil.trim( GXutil.str( A486ForNumCol, 8, 0)) );
         AV21Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV21Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Fec Ult Ut = ", "")+GXutil.trim( localUtil.dtoc( A496ForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) );
         AV21Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV21Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Provisional= ", "")+GXutil.trim( A2749ForPro) );
         AV21Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Fornumcol( A486ForNumCol );
         AV10Col_Inc_Obs.add(AV21Item_Col_Inc_Obs, 0);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV10Col_Inc_Obs.size() > 0 )
      {
         AV42GXV1 = 1 ;
         while ( AV42GXV1 <= AV10Col_Inc_Obs.size() )
         {
            AV21Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)((app.SdtIncidenciasObservaciones_SDT)AV10Col_Inc_Obs.elementAt(-1+AV42GXV1));
            AV20Inc_Obs = AV21Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs() ;
            AV37fornumcol = AV21Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Fornumcol() ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV43Pgmname, AV27Usurcod, AV23Station, AV20Inc_Obs, AV37fornumcol, (byte)(9), httpContext.getMessage( "z", "")) ;
            AV42GXV1 = (int)(AV42GXV1+1) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.eliminaciondeformulastinte_3");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P09WH2_A831TipColCod = new byte[1] ;
      P09WH2_A483ForColNum = new int[1] ;
      P09WH2_A482ForColNom = new String[] {""} ;
      P09WH2_A494ForSer = new String[] {""} ;
      P09WH2_A252CliCod = new int[1] ;
      P09WH2_A396EmprCod = new String[] {""} ;
      P09WH2_A486ForNumCol = new int[1] ;
      P09WH2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P09WH2_n496ForUltUti = new boolean[] {false} ;
      P09WH2_A2749ForPro = new String[] {""} ;
      P09WH2_n2749ForPro = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      A496ForUltUti = GXutil.nullDate() ;
      A2749ForPro = "" ;
      AV21Item_Col_Inc_Obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV10Col_Inc_Obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      AV20Inc_Obs = "" ;
      AV43Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.eliminaciondeformulastinte_3__default(),
         new Object[] {
             new Object[] {
            P09WH2_A831TipColCod, P09WH2_A483ForColNum, P09WH2_A482ForColNom, P09WH2_A494ForSer, P09WH2_A252CliCod, P09WH2_A396EmprCod, P09WH2_A486ForNumCol, P09WH2_A496ForUltUti, P09WH2_n496ForUltUti, P09WH2_A2749ForPro,
            P09WH2_n2749ForPro
            }
            , new Object[] {
            }
         }
      );
      AV43Pgmname = "FormulacionTinte.EliminaciondeFormulasTinte_3" ;
      /* GeneXus formulas. */
      AV43Pgmname = "FormulacionTinte.EliminaciondeFormulasTinte_3" ;
      Gx_err = (short)(0) ;
   }

   private byte AV25TipColCod ;
   private byte A831TipColCod ;
   private short AV35formulasnoeliminadas ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int AV14Forcolnum ;
   private int AV37fornumcol ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private int AV42GXV1 ;
   private long AV33formulas ;
   private String AV11Emprcod ;
   private String AV16Forser ;
   private String AV12Forcolnom ;
   private String AV27Usurcod ;
   private String AV23Station ;
   private String AV38Provisional ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private String A2749ForPro ;
   private String AV43Pgmname ;
   private java.util.Date A496ForUltUti ;
   private boolean n496ForUltUti ;
   private boolean n2749ForPro ;
   private String AV20Inc_Obs ;
   private IDataStoreProvider pr_default ;
   private byte[] P09WH2_A831TipColCod ;
   private int[] P09WH2_A483ForColNum ;
   private String[] P09WH2_A482ForColNom ;
   private String[] P09WH2_A494ForSer ;
   private int[] P09WH2_A252CliCod ;
   private String[] P09WH2_A396EmprCod ;
   private int[] P09WH2_A486ForNumCol ;
   private java.util.Date[] P09WH2_A496ForUltUti ;
   private boolean[] P09WH2_n496ForUltUti ;
   private String[] P09WH2_A2749ForPro ;
   private boolean[] P09WH2_n2749ForPro ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV10Col_Inc_Obs ;
   private app.SdtIncidenciasObservaciones_SDT AV21Item_Col_Inc_Obs ;
}

final  class eliminaciondeformulastinte_3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09WH2", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForNumCol, ForUltUti, ForPro FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09WH3", "DELETE FROM TXPCFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

