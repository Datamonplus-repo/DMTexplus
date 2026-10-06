package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbartins extends GXProcedure
{
   public pbartins( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbartins.class ), "" );
   }

   public pbartins( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pbartins.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pbartins.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbartins.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbartins.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbartins.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbartins.this.AV15Sit = aP4[0];
      this.aP4 = aP4;
      pbartins.this.AV16Bartin = aP5[0];
      this.aP5 = aP5;
      pbartins.this.AV18Oldbartin = aP6[0];
      this.aP6 = aP6;
      pbartins.this.AV19Usurcod = aP7[0];
      this.aP7 = aP7;
      pbartins.this.AV20Station = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = httpContext.getMessage( "&Bartin     =", "") + AV16Bartin + GXutil.newLine( ) + httpContext.getMessage( "&Oldbartin  =", "") + AV18Oldbartin + GXutil.newLine( ) ;
      System.out.println( Gx_msg );
      /* Using cursor P02QK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P02QK2_A252CliCod[0] ;
         n252CliCod = P02QK2_n252CliCod[0] ;
         A212BarSer = P02QK2_A212BarSer[0] ;
         A135BarColNom = P02QK2_A135BarColNom[0] ;
         A136BarColNum = P02QK2_A136BarColNum[0] ;
         A218BarTipCol = P02QK2_A218BarTipCol[0] ;
         A213BarSit = P02QK2_A213BarSit[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_char4[0] = A135BarColNom ;
         GXv_int5[0] = A136BarColNum ;
         GXv_int6[0] = A218BarTipCol ;
         GXv_int7[0] = AV21Cformu ;
         new app.pexicol(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6, GXv_int7) ;
         pbartins.this.A396EmprCod = GXv_char1[0] ;
         pbartins.this.A252CliCod = GXv_int2[0] ;
         pbartins.this.A212BarSer = GXv_char3[0] ;
         pbartins.this.A135BarColNom = GXv_char4[0] ;
         pbartins.this.A136BarColNum = GXv_int5[0] ;
         pbartins.this.A218BarTipCol = GXv_int6[0] ;
         pbartins.this.AV21Cformu = GXv_int7[0] ;
         if ( ( GXutil.strcmp(AV16Bartin, httpContext.getMessage( "S", "")) == 0 ) && ( A213BarSit <= 5 ) )
         {
            if ( AV21Cformu == 0 )
            {
               A213BarSit = (byte)(2) ;
            }
            else
            {
               A213BarSit = (byte)(1) ;
            }
         }
         if ( GXutil.strcmp(AV16Bartin, httpContext.getMessage( "N", "")) == 0 )
         {
            A213BarSit = (byte)(5) ;
         }
         AV17Texto = httpContext.getMessage( "Cambio Situacion por BARTIN, Situacion antigua= ", "") + GXutil.str( AV15Sit, 2, 0) + httpContext.getMessage( " Bartin antiguo = ", "") + AV18Oldbartin + httpContext.getMessage( " Bartin nuevo= ", "") + AV16Bartin + httpContext.getMessage( " Situacion nueva =", "") + GXutil.str( A213BarSit, 2, 0) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV27Pgmname, AV19Usurcod, AV20Station, AV17Texto, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P02QK3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbartins.this.A396EmprCod;
      this.aP1[0] = pbartins.this.A129BarCod;
      this.aP2[0] = pbartins.this.A132BarCodReo;
      this.aP3[0] = pbartins.this.A130BarCodPar;
      this.aP4[0] = pbartins.this.AV15Sit;
      this.aP5[0] = pbartins.this.AV16Bartin;
      this.aP6[0] = pbartins.this.AV18Oldbartin;
      this.aP7[0] = pbartins.this.AV19Usurcod;
      this.aP8[0] = pbartins.this.AV20Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbartins");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P02QK2_A396EmprCod = new String[] {""} ;
      P02QK2_A129BarCod = new int[1] ;
      P02QK2_A132BarCodReo = new byte[1] ;
      P02QK2_A130BarCodPar = new String[] {""} ;
      P02QK2_A252CliCod = new int[1] ;
      P02QK2_n252CliCod = new boolean[] {false} ;
      P02QK2_A212BarSer = new String[] {""} ;
      P02QK2_A135BarColNom = new String[] {""} ;
      P02QK2_A136BarColNum = new int[1] ;
      P02QK2_A218BarTipCol = new byte[1] ;
      P02QK2_A213BarSit = new byte[1] ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new byte[1] ;
      AV17Texto = "" ;
      AV27Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbartins__default(),
         new Object[] {
             new Object[] {
            P02QK2_A396EmprCod, P02QK2_A129BarCod, P02QK2_A132BarCodReo, P02QK2_A130BarCodPar, P02QK2_A252CliCod, P02QK2_n252CliCod, P02QK2_A212BarSer, P02QK2_A135BarColNom, P02QK2_A136BarColNum, P02QK2_A218BarTipCol,
            P02QK2_A213BarSit
            }
            , new Object[] {
            }
         }
      );
      AV27Pgmname = "PBARTINs" ;
      /* GeneXus formulas. */
      AV27Pgmname = "PBARTINs" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV15Sit ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte GXv_int6[] ;
   private byte AV21Cformu ;
   private byte GXv_int7[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV16Bartin ;
   private String AV18Oldbartin ;
   private String AV19Usurcod ;
   private String AV20Station ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV27Pgmname ;
   private boolean n252CliCod ;
   private String AV17Texto ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P02QK2_A396EmprCod ;
   private int[] P02QK2_A129BarCod ;
   private byte[] P02QK2_A132BarCodReo ;
   private String[] P02QK2_A130BarCodPar ;
   private int[] P02QK2_A252CliCod ;
   private boolean[] P02QK2_n252CliCod ;
   private String[] P02QK2_A212BarSer ;
   private String[] P02QK2_A135BarColNom ;
   private int[] P02QK2_A136BarColNum ;
   private byte[] P02QK2_A218BarTipCol ;
   private byte[] P02QK2_A213BarSit ;
}

final  class pbartins__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02QK2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02QK3", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

