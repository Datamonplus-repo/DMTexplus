package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewcor extends GXProcedure
{
   public pnewcor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewcor.class ), "" );
   }

   public pnewcor( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           int[] aP7 )
   {
      pnewcor.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 )
   {
      pnewcor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewcor.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pnewcor.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnewcor.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnewcor.this.AV15CliCodO = aP4[0];
      this.aP4 = aP4;
      pnewcor.this.AV8BarSer = aP5[0];
      this.aP5 = aP5;
      pnewcor.this.AV9BarColNom = aP6[0];
      this.aP6 = aP6;
      pnewcor.this.AV10BarColNum = aP7[0];
      this.aP7 = aP7;
      pnewcor.this.AV11BarTipCol = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01312 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P01312_A252CliCod[0] ;
         n252CliCod = P01312_n252CliCod[0] ;
         A212BarSer = P01312_A212BarSer[0] ;
         AV16Flag = (byte)(0) ;
         GXv_int1[0] = AV16Flag ;
         new app.formulaciontinte.pbufori(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, AV9BarColNom, AV10BarColNum, AV11BarTipCol, GXv_int1) ;
         pnewcor.this.AV16Flag = GXv_int1[0] ;
         if ( AV16Flag == 0 )
         {
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = AV15CliCodO ;
            GXv_char4[0] = AV8BarSer ;
            GXv_char5[0] = AV9BarColNom ;
            GXv_int6[0] = AV10BarColNum ;
            GXv_int1[0] = AV11BarTipCol ;
            GXv_int7[0] = A252CliCod ;
            GXv_char8[0] = A212BarSer ;
            GXv_char9[0] = AV9BarColNom ;
            GXv_int10[0] = AV10BarColNum ;
            GXv_int11[0] = AV11BarTipCol ;
            GXv_int12[0] = (byte)(1) ;
            new app.formulaciontinte.pdupfor(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int1, GXv_int7, GXv_char8, GXv_char9, GXv_int10, GXv_int11, GXv_int12) ;
            pnewcor.this.A396EmprCod = GXv_char2[0] ;
            pnewcor.this.AV15CliCodO = GXv_int3[0] ;
            pnewcor.this.AV8BarSer = GXv_char4[0] ;
            pnewcor.this.AV9BarColNom = GXv_char5[0] ;
            pnewcor.this.AV10BarColNum = GXv_int6[0] ;
            pnewcor.this.AV11BarTipCol = GXv_int1[0] ;
            pnewcor.this.A252CliCod = GXv_int7[0] ;
            pnewcor.this.A212BarSer = GXv_char8[0] ;
            pnewcor.this.AV9BarColNom = GXv_char9[0] ;
            pnewcor.this.AV10BarColNum = GXv_int10[0] ;
            pnewcor.this.AV11BarTipCol = GXv_int11[0] ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewcor.this.A396EmprCod;
      this.aP1[0] = pnewcor.this.A129BarCod;
      this.aP2[0] = pnewcor.this.A132BarCodReo;
      this.aP3[0] = pnewcor.this.A130BarCodPar;
      this.aP4[0] = pnewcor.this.AV15CliCodO;
      this.aP5[0] = pnewcor.this.AV8BarSer;
      this.aP6[0] = pnewcor.this.AV9BarColNom;
      this.aP7[0] = pnewcor.this.AV10BarColNum;
      this.aP8[0] = pnewcor.this.AV11BarTipCol;
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
      P01312_A396EmprCod = new String[] {""} ;
      P01312_A129BarCod = new int[1] ;
      P01312_A132BarCodReo = new byte[1] ;
      P01312_A130BarCodPar = new String[] {""} ;
      P01312_A252CliCod = new int[1] ;
      P01312_n252CliCod = new boolean[] {false} ;
      P01312_A212BarSer = new String[] {""} ;
      A212BarSer = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_int7 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_int12 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewcor__default(),
         new Object[] {
             new Object[] {
            P01312_A396EmprCod, P01312_A129BarCod, P01312_A132BarCodReo, P01312_A130BarCodPar, P01312_A252CliCod, P01312_n252CliCod, P01312_A212BarSer
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV11BarTipCol ;
   private byte AV16Flag ;
   private byte GXv_int1[] ;
   private byte GXv_int11[] ;
   private byte GXv_int12[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV15CliCodO ;
   private int AV10BarColNum ;
   private int A252CliCod ;
   private int GXv_int3[] ;
   private int GXv_int6[] ;
   private int GXv_int7[] ;
   private int GXv_int10[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8BarSer ;
   private String AV9BarColNom ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private boolean n252CliCod ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P01312_A396EmprCod ;
   private int[] P01312_A129BarCod ;
   private byte[] P01312_A132BarCodReo ;
   private String[] P01312_A130BarCodPar ;
   private int[] P01312_A252CliCod ;
   private boolean[] P01312_n252CliCod ;
   private String[] P01312_A212BarSer ;
}

final  class pnewcor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01312", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CliCod, BarSer FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

