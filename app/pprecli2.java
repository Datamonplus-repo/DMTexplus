package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprecli2 extends GXProcedure
{
   public pprecli2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprecli2.class ), "" );
   }

   public pprecli2( int remoteHandle ,
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
                        java.math.BigDecimal aP6 ,
                        java.math.BigDecimal aP7 ,
                        String aP8 ,
                        short aP9 ,
                        java.math.BigDecimal aP10 ,
                        String aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             java.math.BigDecimal aP6 ,
                             java.math.BigDecimal aP7 ,
                             String aP8 ,
                             short aP9 ,
                             java.math.BigDecimal aP10 ,
                             String aP11 )
   {
      pprecli2.this.A396EmprCod = aP0;
      pprecli2.this.A252CliCod = aP1;
      pprecli2.this.A494ForSer = aP2;
      pprecli2.this.A482ForColNom = aP3;
      pprecli2.this.A483ForColNum = aP4;
      pprecli2.this.A831TipColCod = aP5;
      pprecli2.this.AV9NewPreKgm = aP6;
      pprecli2.this.AV10NewPreMtr = aP7;
      pprecli2.this.AV12Obs = aP8;
      pprecli2.this.AV17GrdTipARt = aP9;
      pprecli2.this.AV18MV = aP10;
      pprecli2.this.AV11NewPreDef = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pprecli2.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      pprecli2.this.A396EmprCod = GXv_char2[0] ;
      pprecli2.this.AV14EmprNom = GXv_char3[0] ;
      pprecli2.this.AV15UsurCod = GXv_char4[0] ;
      AV16Inc_obs = "" ;
      /* Using cursor P01YA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A492ForPreKgm = P01YA2_A492ForPreKgm[0] ;
         n492ForPreKgm = P01YA2_n492ForPreKgm[0] ;
         A493ForPreMtr = P01YA2_A493ForPreMtr[0] ;
         n493ForPreMtr = P01YA2_n493ForPreMtr[0] ;
         A8561Fam_Cod = P01YA2_A8561Fam_Cod[0] ;
         n8561Fam_Cod = P01YA2_n8561Fam_Cod[0] ;
         A4223ForCosUti = P01YA2_A4223ForCosUti[0] ;
         n4223ForCosUti = P01YA2_n4223ForCosUti[0] ;
         A491ForPreDef = P01YA2_A491ForPreDef[0] ;
         n491ForPreDef = P01YA2_n491ForPreDef[0] ;
         A3585ForPreFec = P01YA2_A3585ForPreFec[0] ;
         n3585ForPreFec = P01YA2_n3585ForPreFec[0] ;
         A3587ForFecAnt = P01YA2_A3587ForFecAnt[0] ;
         n3587ForFecAnt = P01YA2_n3587ForFecAnt[0] ;
         A5626ForObsM = P01YA2_A5626ForObsM[0] ;
         n5626ForObsM = P01YA2_n5626ForObsM[0] ;
         AV16Inc_obs = httpContext.getMessage( "Actualizacion Precios", "") + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Cliente   = ", "") + GXutil.str( A252CliCod, 6, 0) + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Articulo  = ", "") + A494ForSer + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Color     = ", "") + A482ForColNom + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Numero    = ", "") + GXutil.str( A483ForColNum, 6, 0) + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Tc        = ", "") + GXutil.str( A831TipColCod, 2, 0) + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Precio Kg = ", "") + GXutil.str( A492ForPreKgm, 12, 5) + " <- " + GXutil.str( AV9NewPreKgm, 12, 5) + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Precio Mt = ", "") + GXutil.str( A493ForPreMtr, 12, 5) + " <- " + GXutil.str( AV10NewPreMtr, 12, 5) + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Classe    = ", "") + GXutil.str( A8561Fam_Cod, 4, 0) + " <- " + GXutil.str( AV17GrdTipARt, 4, 0) + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "MV        = ", "") + GXutil.str( A4223ForCosUti, 13, 2) + " <- " + GXutil.str( AV18MV, 10, 2) ;
         A492ForPreKgm = AV9NewPreKgm ;
         n492ForPreKgm = false ;
         A493ForPreMtr = AV10NewPreMtr ;
         n493ForPreMtr = false ;
         A491ForPreDef = AV11NewPreDef ;
         n491ForPreDef = false ;
         A3587ForFecAnt = A3585ForPreFec ;
         n3587ForFecAnt = false ;
         A3585ForPreFec = GXutil.today( ) ;
         n3585ForPreFec = false ;
         A5626ForObsM = AV12Obs ;
         n5626ForObsM = false ;
         A8561Fam_Cod = AV17GrdTipARt ;
         n8561Fam_Cod = false ;
         A4223ForCosUti = AV18MV ;
         n4223ForCosUti = false ;
         /* Using cursor P01YA3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n492ForPreKgm), A492ForPreKgm, Boolean.valueOf(n493ForPreMtr), A493ForPreMtr, Boolean.valueOf(n8561Fam_Cod), Short.valueOf(A8561Fam_Cod), Boolean.valueOf(n4223ForCosUti), A4223ForCosUti, Boolean.valueOf(n491ForPreDef), A491ForPreDef, Boolean.valueOf(n3585ForPreFec), A3585ForPreFec, Boolean.valueOf(n3587ForFecAnt), A3587ForFecAnt, Boolean.valueOf(n5626ForObsM), A5626ForObsM, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV22Pgmname, AV15UsurCod, AV13Station, AV16Inc_obs, 99999999, (byte)(0), " ") ;
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pprecli2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV14EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV15UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV16Inc_obs = "" ;
      scmdbuf = "" ;
      P01YA2_A396EmprCod = new String[] {""} ;
      P01YA2_A252CliCod = new int[1] ;
      P01YA2_A494ForSer = new String[] {""} ;
      P01YA2_A482ForColNom = new String[] {""} ;
      P01YA2_A483ForColNum = new int[1] ;
      P01YA2_A831TipColCod = new byte[1] ;
      P01YA2_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YA2_n492ForPreKgm = new boolean[] {false} ;
      P01YA2_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YA2_n493ForPreMtr = new boolean[] {false} ;
      P01YA2_A8561Fam_Cod = new short[1] ;
      P01YA2_n8561Fam_Cod = new boolean[] {false} ;
      P01YA2_A4223ForCosUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YA2_n4223ForCosUti = new boolean[] {false} ;
      P01YA2_A491ForPreDef = new String[] {""} ;
      P01YA2_n491ForPreDef = new boolean[] {false} ;
      P01YA2_A3585ForPreFec = new java.util.Date[] {GXutil.nullDate()} ;
      P01YA2_n3585ForPreFec = new boolean[] {false} ;
      P01YA2_A3587ForFecAnt = new java.util.Date[] {GXutil.nullDate()} ;
      P01YA2_n3587ForFecAnt = new boolean[] {false} ;
      P01YA2_A5626ForObsM = new String[] {""} ;
      P01YA2_n5626ForObsM = new boolean[] {false} ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A4223ForCosUti = DecimalUtil.ZERO ;
      A491ForPreDef = "" ;
      A3585ForPreFec = GXutil.nullDate() ;
      A3587ForFecAnt = GXutil.nullDate() ;
      A5626ForObsM = "" ;
      AV22Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprecli2__default(),
         new Object[] {
             new Object[] {
            P01YA2_A396EmprCod, P01YA2_A252CliCod, P01YA2_A494ForSer, P01YA2_A482ForColNom, P01YA2_A483ForColNum, P01YA2_A831TipColCod, P01YA2_A492ForPreKgm, P01YA2_n492ForPreKgm, P01YA2_A493ForPreMtr, P01YA2_n493ForPreMtr,
            P01YA2_A8561Fam_Cod, P01YA2_n8561Fam_Cod, P01YA2_A4223ForCosUti, P01YA2_n4223ForCosUti, P01YA2_A491ForPreDef, P01YA2_n491ForPreDef, P01YA2_A3585ForPreFec, P01YA2_n3585ForPreFec, P01YA2_A3587ForFecAnt, P01YA2_n3587ForFecAnt,
            P01YA2_A5626ForObsM, P01YA2_n5626ForObsM
            }
            , new Object[] {
            }
         }
      );
      AV22Pgmname = "PPRECLI2" ;
      /* GeneXus formulas. */
      AV22Pgmname = "PPRECLI2" ;
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short AV17GrdTipARt ;
   private short A8561Fam_Cod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV9NewPreKgm ;
   private java.math.BigDecimal AV10NewPreMtr ;
   private java.math.BigDecimal AV18MV ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A493ForPreMtr ;
   private java.math.BigDecimal A4223ForCosUti ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV12Obs ;
   private String AV11NewPreDef ;
   private String AV13Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV14EmprNom ;
   private String GXv_char3[] ;
   private String AV15UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A491ForPreDef ;
   private String AV22Pgmname ;
   private java.util.Date A3585ForPreFec ;
   private java.util.Date A3587ForFecAnt ;
   private boolean n492ForPreKgm ;
   private boolean n493ForPreMtr ;
   private boolean n8561Fam_Cod ;
   private boolean n4223ForCosUti ;
   private boolean n491ForPreDef ;
   private boolean n3585ForPreFec ;
   private boolean n3587ForFecAnt ;
   private boolean n5626ForObsM ;
   private String AV16Inc_obs ;
   private String A5626ForObsM ;
   private IDataStoreProvider pr_default ;
   private String[] P01YA2_A396EmprCod ;
   private int[] P01YA2_A252CliCod ;
   private String[] P01YA2_A494ForSer ;
   private String[] P01YA2_A482ForColNom ;
   private int[] P01YA2_A483ForColNum ;
   private byte[] P01YA2_A831TipColCod ;
   private java.math.BigDecimal[] P01YA2_A492ForPreKgm ;
   private boolean[] P01YA2_n492ForPreKgm ;
   private java.math.BigDecimal[] P01YA2_A493ForPreMtr ;
   private boolean[] P01YA2_n493ForPreMtr ;
   private short[] P01YA2_A8561Fam_Cod ;
   private boolean[] P01YA2_n8561Fam_Cod ;
   private java.math.BigDecimal[] P01YA2_A4223ForCosUti ;
   private boolean[] P01YA2_n4223ForCosUti ;
   private String[] P01YA2_A491ForPreDef ;
   private boolean[] P01YA2_n491ForPreDef ;
   private java.util.Date[] P01YA2_A3585ForPreFec ;
   private boolean[] P01YA2_n3585ForPreFec ;
   private java.util.Date[] P01YA2_A3587ForFecAnt ;
   private boolean[] P01YA2_n3587ForFecAnt ;
   private String[] P01YA2_A5626ForObsM ;
   private boolean[] P01YA2_n5626ForObsM ;
}

final  class pprecli2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01YA2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForPreKgm, ForPreMtr, Fam_Cod, ForCosUti, ForPreDef, ForPreFec, ForFecAnt, ForObsM FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01YA3", "UPDATE TXPCFORMU SET ForPreKgm=?, ForPreMtr=?, Fam_Cod=?, ForCosUti=?, ForPreDef=?, ForPreFec=?, ForFecAnt=?, ForObsM=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 300);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setString(11, (String)parms[18], 16);
               stmt.setString(12, (String)parms[19], 13);
               stmt.setInt(13, ((Number) parms[20]).intValue());
               stmt.setByte(14, ((Number) parms[21]).byteValue());
               return;
      }
   }

}

