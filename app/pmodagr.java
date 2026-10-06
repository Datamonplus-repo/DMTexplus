package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodagr extends GXProcedure
{
   public pmodagr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodagr.class ), "" );
   }

   public pmodagr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 )
   {
      pmodagr.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 )
   {
      pmodagr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodagr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmodagr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmodagr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmodagr.this.AV15BarMaqCod = aP4[0];
      this.aP4 = aP4;
      pmodagr.this.AV16BarVolMaq = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00252 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A119BarAgrCod = P00252_A119BarAgrCod[0] ;
         A124BarAgrReo = P00252_A124BarAgrReo[0] ;
         A122BarAgrPar = P00252_A122BarAgrPar[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A119BarAgrCod ;
         GXv_int3[0] = A124BarAgrReo ;
         GXv_char4[0] = A122BarAgrPar ;
         GXv_char5[0] = AV15BarMaqCod ;
         GXv_int6[0] = AV16BarVolMaq ;
         GXv_char7[0] = AV17BarSer ;
         GXv_char8[0] = AV18DisArtDsc ;
         GXv_int9[0] = AV19CliCod ;
         GXv_int10[0] = AV20DisCod ;
         GXv_char11[0] = AV21BarColNom ;
         GXv_int12[0] = AV22BarColNum ;
         GXv_char13[0] = AV23BarNomCli ;
         GXv_int14[0] = AV24BarNumCli ;
         GXv_char15[0] = AV25BarDisNum ;
         new app.pmodmvo(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_char7, GXv_char8, GXv_int9, GXv_int10, GXv_char11, GXv_int12, GXv_char13, GXv_int14, GXv_char15) ;
         pmodagr.this.A396EmprCod = GXv_char1[0] ;
         pmodagr.this.A119BarAgrCod = GXv_int2[0] ;
         pmodagr.this.A124BarAgrReo = GXv_int3[0] ;
         pmodagr.this.A122BarAgrPar = GXv_char4[0] ;
         pmodagr.this.AV15BarMaqCod = GXv_char5[0] ;
         pmodagr.this.AV16BarVolMaq = GXv_int6[0] ;
         pmodagr.this.AV17BarSer = GXv_char7[0] ;
         pmodagr.this.AV18DisArtDsc = GXv_char8[0] ;
         pmodagr.this.AV19CliCod = GXv_int9[0] ;
         pmodagr.this.AV20DisCod = GXv_int10[0] ;
         pmodagr.this.AV21BarColNom = GXv_char11[0] ;
         pmodagr.this.AV22BarColNum = GXv_int12[0] ;
         pmodagr.this.AV23BarNomCli = GXv_char13[0] ;
         pmodagr.this.AV24BarNumCli = GXv_int14[0] ;
         pmodagr.this.AV25BarDisNum = GXv_char15[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodagr.this.A396EmprCod;
      this.aP1[0] = pmodagr.this.A129BarCod;
      this.aP2[0] = pmodagr.this.A132BarCodReo;
      this.aP3[0] = pmodagr.this.A130BarCodPar;
      this.aP4[0] = pmodagr.this.AV15BarMaqCod;
      this.aP5[0] = pmodagr.this.AV16BarVolMaq;
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
      P00252_A396EmprCod = new String[] {""} ;
      P00252_A129BarCod = new int[1] ;
      P00252_A132BarCodReo = new byte[1] ;
      P00252_A130BarCodPar = new String[] {""} ;
      P00252_A119BarAgrCod = new int[1] ;
      P00252_A124BarAgrReo = new byte[1] ;
      P00252_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      AV17BarSer = "" ;
      GXv_char7 = new String[1] ;
      AV18DisArtDsc = "" ;
      GXv_char8 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int10 = new int[1] ;
      AV21BarColNom = "" ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new int[1] ;
      AV23BarNomCli = "" ;
      GXv_char13 = new String[1] ;
      GXv_int14 = new int[1] ;
      AV25BarDisNum = "" ;
      GXv_char15 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodagr__default(),
         new Object[] {
             new Object[] {
            P00252_A396EmprCod, P00252_A129BarCod, P00252_A132BarCodReo, P00252_A130BarCodPar, P00252_A119BarAgrCod, P00252_A124BarAgrReo, P00252_A122BarAgrPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV16BarVolMaq ;
   private int A119BarAgrCod ;
   private int GXv_int2[] ;
   private int GXv_int6[] ;
   private int AV19CliCod ;
   private int GXv_int9[] ;
   private int AV20DisCod ;
   private int GXv_int10[] ;
   private int AV22BarColNum ;
   private int GXv_int12[] ;
   private int AV24BarNumCli ;
   private int GXv_int14[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15BarMaqCod ;
   private String scmdbuf ;
   private String A122BarAgrPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String AV17BarSer ;
   private String GXv_char7[] ;
   private String AV18DisArtDsc ;
   private String GXv_char8[] ;
   private String AV21BarColNom ;
   private String GXv_char11[] ;
   private String AV23BarNomCli ;
   private String GXv_char13[] ;
   private String AV25BarDisNum ;
   private String GXv_char15[] ;
   private int[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00252_A396EmprCod ;
   private int[] P00252_A129BarCod ;
   private byte[] P00252_A132BarCodReo ;
   private String[] P00252_A130BarCodPar ;
   private int[] P00252_A119BarAgrCod ;
   private byte[] P00252_A124BarAgrReo ;
   private String[] P00252_A122BarAgrPar ;
}

final  class pmodagr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00252", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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

