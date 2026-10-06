package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptin020 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptin020 pgm = new aptin020 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptin020( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptin020.class ), "" );
   }

   public aptin020( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Proceso de busqueda en Cformu....", "") );
      /* Using cursor P02YB2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P02YB2_A831TipColCod[0] ;
         A482ForColNom = P02YB2_A482ForColNom[0] ;
         A396EmprCod = P02YB2_A396EmprCod[0] ;
         A7537ForOpNum = P02YB2_A7537ForOpNum[0] ;
         n7537ForOpNum = P02YB2_n7537ForOpNum[0] ;
         A483ForColNum = P02YB2_A483ForColNum[0] ;
         A494ForSer = P02YB2_A494ForSer[0] ;
         A252CliCod = P02YB2_A252CliCod[0] ;
         if ( GXutil.strcmp(A482ForColNom, httpContext.getMessage( "1000C1", "")) == 0 )
         {
            AV8Emprcod = A396EmprCod ;
            AV9Clicod = A252CliCod ;
            AV10Forser = A494ForSer ;
            AV11Forcolnom = A482ForColNom ;
            AV12Forcolnum = A483ForColNum ;
            GXv_char1[0] = AV8Emprcod ;
            GXv_int2[0] = AV9Clicod ;
            GXv_char3[0] = AV10Forser ;
            GXv_char4[0] = AV11Forcolnom ;
            GXv_int5[0] = AV12Forcolnum ;
            GXv_int6[0] = AV13TipColcod ;
            GXv_int7[0] = AV14Existe ;
            new app.ptin021(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6, GXv_int7) ;
            aptin020.this.AV8Emprcod = GXv_char1[0] ;
            aptin020.this.AV9Clicod = GXv_int2[0] ;
            aptin020.this.AV10Forser = GXv_char3[0] ;
            aptin020.this.AV11Forcolnom = GXv_char4[0] ;
            aptin020.this.AV12Forcolnum = GXv_int5[0] ;
            aptin020.this.AV13TipColcod = GXv_int6[0] ;
            aptin020.this.AV14Existe = GXv_int7[0] ;
            if ( AV14Existe == 1 )
            {
               A7537ForOpNum = (byte)(99) ;
               n7537ForOpNum = false ;
            }
            /* Using cursor P02YB3 */
            pr_default.execute(1, new Object[] {Boolean.valueOf(n7537ForOpNum), Byte.valueOf(A7537ForOpNum), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fim Proceso de busqueda en Cformu....", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptin020.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptin020");
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
      P02YB2_A831TipColCod = new byte[1] ;
      P02YB2_A482ForColNom = new String[] {""} ;
      P02YB2_A396EmprCod = new String[] {""} ;
      P02YB2_A7537ForOpNum = new byte[1] ;
      P02YB2_n7537ForOpNum = new boolean[] {false} ;
      P02YB2_A483ForColNum = new int[1] ;
      P02YB2_A494ForSer = new String[] {""} ;
      P02YB2_A252CliCod = new int[1] ;
      A482ForColNom = "" ;
      A396EmprCod = "" ;
      A494ForSer = "" ;
      AV8Emprcod = "" ;
      AV10Forser = "" ;
      AV11Forcolnom = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptin020__default(),
         new Object[] {
             new Object[] {
            P02YB2_A831TipColCod, P02YB2_A482ForColNom, P02YB2_A396EmprCod, P02YB2_A7537ForOpNum, P02YB2_n7537ForOpNum, P02YB2_A483ForColNum, P02YB2_A494ForSer, P02YB2_A252CliCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte A7537ForOpNum ;
   private byte AV13TipColcod ;
   private byte GXv_int6[] ;
   private byte AV14Existe ;
   private byte GXv_int7[] ;
   private short Gx_err ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int AV9Clicod ;
   private int AV12Forcolnum ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String AV8Emprcod ;
   private String AV10Forser ;
   private String AV11Forcolnom ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private boolean n7537ForOpNum ;
   private IDataStoreProvider pr_default ;
   private byte[] P02YB2_A831TipColCod ;
   private String[] P02YB2_A482ForColNom ;
   private String[] P02YB2_A396EmprCod ;
   private byte[] P02YB2_A7537ForOpNum ;
   private boolean[] P02YB2_n7537ForOpNum ;
   private int[] P02YB2_A483ForColNum ;
   private String[] P02YB2_A494ForSer ;
   private int[] P02YB2_A252CliCod ;
}

final  class aptin020__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02YB2", "SELECT TipColCod, ForColNom, EmprCod, ForOpNum, ForColNum, ForSer, CliCod FROM TXPCFORMU WHERE (EmprCod = '001') AND (TipColCod = 0) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02YB3", "UPDATE TXPCFORMU SET ForOpNum=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

