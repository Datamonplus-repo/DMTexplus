package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paviver extends GXProcedure
{
   public paviver( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paviver.class ), "" );
   }

   public paviver( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 )
   {
      paviver.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      paviver.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paviver.this.AV8Clicod = aP1[0];
      this.aP1 = aP1;
      paviver.this.AV9DisArtCod = aP2[0];
      this.aP2 = aP2;
      paviver.this.AV10Discolnom = aP3[0];
      this.aP3 = aP3;
      paviver.this.AV11Discolnum = aP4[0];
      this.aP4 = aP4;
      paviver.this.AV12Distipcol = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03VB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Clicod), AV9DisArtCod, AV10Discolnom, Integer.valueOf(AV11Discolnum), Byte.valueOf(AV12Distipcol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P03VB2_A831TipColCod[0] ;
         A483ForColNum = P03VB2_A483ForColNum[0] ;
         A482ForColNom = P03VB2_A482ForColNom[0] ;
         A494ForSer = P03VB2_A494ForSer[0] ;
         A252CliCod = P03VB2_A252CliCod[0] ;
         A486ForNumCol = P03VB2_A486ForNumCol[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A494ForSer ;
         GXv_int4[0] = A486ForNumCol ;
         GXv_int5[0] = A831TipColCod ;
         GXv_int6[0] = (short)(0) ;
         GXv_char7[0] = "" ;
         GXv_int8[0] = (short)(0) ;
         GXv_char9[0] = "" ;
         GXv_int10[0] = (short)(0) ;
         GXv_char11[0] = "" ;
         GXv_int12[0] = (short)(0) ;
         GXv_char13[0] = httpContext.getMessage( "DT", "") ;
         GXv_int14[0] = 0 ;
         GXv_int15[0] = 0 ;
         GXv_char16[0] = " " ;
         GXv_char17[0] = "" ;
         GXv_char18[0] = " " ;
         GXv_int19[0] = A486ForNumCol ;
         GXv_int20[0] = A486ForNumCol ;
         new app.ppaviver(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_int4, GXv_int5, GXv_int6, GXv_char7, GXv_int8, GXv_char9, GXv_int10, GXv_char11, GXv_int12, GXv_char13, GXv_int14, GXv_int15, GXv_char16, GXv_char17, GXv_char18, GXv_int19, GXv_int20) ;
         paviver.this.A396EmprCod = GXv_char1[0] ;
         paviver.this.A252CliCod = GXv_int2[0] ;
         paviver.this.A494ForSer = GXv_char3[0] ;
         paviver.this.A486ForNumCol = GXv_int4[0] ;
         paviver.this.A831TipColCod = GXv_int5[0] ;
         paviver.this.A486ForNumCol = GXv_int19[0] ;
         paviver.this.A486ForNumCol = GXv_int20[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paviver.this.A396EmprCod;
      this.aP1[0] = paviver.this.AV8Clicod;
      this.aP2[0] = paviver.this.AV9DisArtCod;
      this.aP3[0] = paviver.this.AV10Discolnom;
      this.aP4[0] = paviver.this.AV11Discolnum;
      this.aP5[0] = paviver.this.AV12Distipcol;
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
      P03VB2_A396EmprCod = new String[] {""} ;
      P03VB2_A831TipColCod = new byte[1] ;
      P03VB2_A483ForColNum = new int[1] ;
      P03VB2_A482ForColNom = new String[] {""} ;
      P03VB2_A494ForSer = new String[] {""} ;
      P03VB2_A252CliCod = new int[1] ;
      P03VB2_A486ForNumCol = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int6 = new short[1] ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new short[1] ;
      GXv_char13 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int15 = new int[1] ;
      GXv_char16 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_int19 = new int[1] ;
      GXv_int20 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paviver__default(),
         new Object[] {
             new Object[] {
            P03VB2_A396EmprCod, P03VB2_A831TipColCod, P03VB2_A483ForColNum, P03VB2_A482ForColNom, P03VB2_A494ForSer, P03VB2_A252CliCod, P03VB2_A486ForNumCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12Distipcol ;
   private byte A831TipColCod ;
   private byte GXv_int5[] ;
   private short GXv_int6[] ;
   private short GXv_int8[] ;
   private short GXv_int10[] ;
   private short GXv_int12[] ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int AV11Discolnum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private int GXv_int2[] ;
   private int GXv_int4[] ;
   private int GXv_int14[] ;
   private int GXv_int15[] ;
   private int GXv_int19[] ;
   private int GXv_int20[] ;
   private String A396EmprCod ;
   private String AV9DisArtCod ;
   private String AV10Discolnom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char7[] ;
   private String GXv_char9[] ;
   private String GXv_char11[] ;
   private String GXv_char13[] ;
   private String GXv_char16[] ;
   private String GXv_char17[] ;
   private String GXv_char18[] ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P03VB2_A396EmprCod ;
   private byte[] P03VB2_A831TipColCod ;
   private int[] P03VB2_A483ForColNum ;
   private String[] P03VB2_A482ForColNom ;
   private String[] P03VB2_A494ForSer ;
   private int[] P03VB2_A252CliCod ;
   private int[] P03VB2_A486ForNumCol ;
}

final  class paviver__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03VB2", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
      }
   }

}

