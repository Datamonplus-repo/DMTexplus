package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apjln078 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apjln078 pgm = new apjln078 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apjln078( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apjln078.class ), "" );
   }

   public apjln078( int remoteHandle ,
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
      AV10Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV11EmprCod ;
      GXv_char2[0] = AV13EmprNom ;
      GXv_char3[0] = AV12Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char1, GXv_char2, GXv_char3) ;
      apjln078.this.AV11EmprCod = GXv_char1[0] ;
      apjln078.this.AV13EmprNom = GXv_char2[0] ;
      apjln078.this.AV12Usurcod = GXv_char3[0] ;
      System.out.println( httpContext.getMessage( "Processando Tabla ccdef1", "") );
      /* Using cursor P022Z2 */
      pr_default.execute(0, new Object[] {AV11EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P022Z2_A396EmprCod[0] ;
         A4047CCTLinVarW = P022Z2_A4047CCTLinVarW[0] ;
         A4034CCTLin = P022Z2_A4034CCTLin[0] ;
         A4031CCTCod = P022Z2_A4031CCTCod[0] ;
         AV24Wrd = GXutil.trim( GXutil.str( A4031CCTCod, 6, 0)) + GXutil.trim( A4047CCTLinVarW) ;
         A4047CCTLinVarW = GXutil.trim( AV24Wrd) ;
         /* Using cursor P022Z3 */
         pr_default.execute(1, new Object[] {A4047CCTLinVarW, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef1");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fim Processo", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pjln078.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apjln078");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Station = "" ;
      AV11EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV12Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P022Z2_A396EmprCod = new String[] {""} ;
      P022Z2_A4047CCTLinVarW = new String[] {""} ;
      P022Z2_A4034CCTLin = new short[1] ;
      P022Z2_A4031CCTCod = new int[1] ;
      A396EmprCod = "" ;
      A4047CCTLinVarW = "" ;
      AV24Wrd = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apjln078__default(),
         new Object[] {
             new Object[] {
            P022Z2_A396EmprCod, P022Z2_A4047CCTLinVarW, P022Z2_A4034CCTLin, P022Z2_A4031CCTCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4034CCTLin ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private String AV10Station ;
   private String AV11EmprCod ;
   private String GXv_char1[] ;
   private String AV13EmprNom ;
   private String GXv_char2[] ;
   private String AV12Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A4047CCTLinVarW ;
   private String AV24Wrd ;
   private IDataStoreProvider pr_default ;
   private String[] P022Z2_A396EmprCod ;
   private String[] P022Z2_A4047CCTLinVarW ;
   private short[] P022Z2_A4034CCTLin ;
   private int[] P022Z2_A4031CCTCod ;
}

final  class apjln078__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P022Z2", "SELECT EmprCod, CCTLinVarW, CCTLin, CCTCod FROM TXPCCDef1 WHERE EmprCod = ? ORDER BY EmprCod, CCTCod, CCTLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P022Z3", "UPDATE TXPCCDef1 SET CCTLinVarW=?  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef1")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 32);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 32);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

