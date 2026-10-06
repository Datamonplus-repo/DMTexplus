package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psitint extends GXProcedure
{
   public psitint( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psitint.class ), "" );
   }

   public psitint( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 )
   {
      psitint.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      psitint.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psitint.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      psitint.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      psitint.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      psitint.this.AV8F_tint = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8F_tint = (byte)(0) ;
      /* Using cursor P01UH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P01UH2_A252CliCod[0] ;
         n252CliCod = P01UH2_n252CliCod[0] ;
         A212BarSer = P01UH2_A212BarSer[0] ;
         A135BarColNom = P01UH2_A135BarColNom[0] ;
         A136BarColNum = P01UH2_A136BarColNum[0] ;
         A218BarTipCol = P01UH2_A218BarTipCol[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_char4[0] = A135BarColNom ;
         GXv_int5[0] = A136BarColNum ;
         GXv_int6[0] = A218BarTipCol ;
         GXv_int7[0] = AV8F_tint ;
         new app.pexicol(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6, GXv_int7) ;
         psitint.this.A396EmprCod = GXv_char1[0] ;
         psitint.this.A252CliCod = GXv_int2[0] ;
         psitint.this.A212BarSer = GXv_char3[0] ;
         psitint.this.A135BarColNom = GXv_char4[0] ;
         psitint.this.A136BarColNum = GXv_int5[0] ;
         psitint.this.A218BarTipCol = GXv_int6[0] ;
         psitint.this.AV8F_tint = GXv_int7[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psitint.this.A396EmprCod;
      this.aP1[0] = psitint.this.A129BarCod;
      this.aP2[0] = psitint.this.A132BarCodReo;
      this.aP3[0] = psitint.this.A130BarCodPar;
      this.aP4[0] = psitint.this.AV8F_tint;
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
      P01UH2_A396EmprCod = new String[] {""} ;
      P01UH2_A129BarCod = new int[1] ;
      P01UH2_A132BarCodReo = new byte[1] ;
      P01UH2_A130BarCodPar = new String[] {""} ;
      P01UH2_A252CliCod = new int[1] ;
      P01UH2_n252CliCod = new boolean[] {false} ;
      P01UH2_A212BarSer = new String[] {""} ;
      P01UH2_A135BarColNom = new String[] {""} ;
      P01UH2_A136BarColNum = new int[1] ;
      P01UH2_A218BarTipCol = new byte[1] ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psitint__default(),
         new Object[] {
             new Object[] {
            P01UH2_A396EmprCod, P01UH2_A129BarCod, P01UH2_A132BarCodReo, P01UH2_A130BarCodPar, P01UH2_A252CliCod, P01UH2_n252CliCod, P01UH2_A212BarSer, P01UH2_A135BarColNom, P01UH2_A136BarColNum, P01UH2_A218BarTipCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8F_tint ;
   private byte A218BarTipCol ;
   private byte GXv_int6[] ;
   private byte GXv_int7[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private boolean n252CliCod ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01UH2_A396EmprCod ;
   private int[] P01UH2_A129BarCod ;
   private byte[] P01UH2_A132BarCodReo ;
   private String[] P01UH2_A130BarCodPar ;
   private int[] P01UH2_A252CliCod ;
   private boolean[] P01UH2_n252CliCod ;
   private String[] P01UH2_A212BarSer ;
   private String[] P01UH2_A135BarColNom ;
   private int[] P01UH2_A136BarColNum ;
   private byte[] P01UH2_A218BarTipCol ;
}

final  class psitint__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01UH2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
      }
   }

}

