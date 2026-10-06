package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aperrccstks extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aperrccstks pgm = new aperrccstks (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aperrccstks( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aperrccstks.class ), "" );
   }

   public aperrccstks( int remoteHandle ,
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
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV15Emprcod = "001" ;
      /* Using cursor P04DV2 */
      pr_default.execute(0, new Object[] {AV15Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10954Vts_FecF = P04DV2_A10954Vts_FecF[0] ;
         n10954Vts_FecF = P04DV2_n10954Vts_FecF[0] ;
         A396EmprCod = P04DV2_A396EmprCod[0] ;
         A10940Vts_Nbarca = P04DV2_A10940Vts_Nbarca[0] ;
         A10951Vts_Rgto = P04DV2_A10951Vts_Rgto[0] ;
         AV18Lenv = GXutil.len( GXutil.trim( A10940Vts_Nbarca)) ;
         AV19Pos = (byte)(AV18Lenv-1) ;
         AV16CCstkbar = (int)(GXutil.lval( GXutil.substring( GXutil.trim( A10940Vts_Nbarca), 1, AV19Pos))) ;
         AV17Ccstkreo = (byte)(GXutil.lval( GXutil.substring( GXutil.trim( A10940Vts_Nbarca), (int)(AV18Lenv), 1))) ;
         AV20Ccstkfec = A10954Vts_FecF ;
         Gx_msg = httpContext.getMessage( "NBarcada= ", "") + A10940Vts_Nbarca + " " + localUtil.dtoc( A10954Vts_FecF, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         System.out.println( Gx_msg );
         /* Execute user subroutine: 'CCSTKS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CCSTKS' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04DV3 */
      pr_default.execute(1, new Object[] {AV20Ccstkfec, AV15Emprcod, Integer.valueOf(AV16CCstkbar), Byte.valueOf(AV17Ccstkreo)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
      /* End optimized UPDATE. */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(perrccstks.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aperrccstks");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Emprcod = "" ;
      scmdbuf = "" ;
      P04DV2_A10954Vts_FecF = new java.util.Date[] {GXutil.nullDate()} ;
      P04DV2_n10954Vts_FecF = new boolean[] {false} ;
      P04DV2_A396EmprCod = new String[] {""} ;
      P04DV2_A10940Vts_Nbarca = new String[] {""} ;
      P04DV2_A10951Vts_Rgto = new String[] {""} ;
      A10954Vts_FecF = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A10940Vts_Nbarca = "" ;
      A10951Vts_Rgto = "" ;
      AV20Ccstkfec = GXutil.nullDate() ;
      Gx_msg = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aperrccstks__default(),
         new Object[] {
             new Object[] {
            P04DV2_A10954Vts_FecF, P04DV2_n10954Vts_FecF, P04DV2_A396EmprCod, P04DV2_A10940Vts_Nbarca, P04DV2_A10951Vts_Rgto
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19Pos ;
   private byte AV17Ccstkreo ;
   private short Gx_err ;
   private int AV16CCstkbar ;
   private long AV18Lenv ;
   private String AV15Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A10940Vts_Nbarca ;
   private String A10951Vts_Rgto ;
   private String Gx_msg ;
   private java.util.Date A10954Vts_FecF ;
   private java.util.Date AV20Ccstkfec ;
   private java.util.Date A3348CCStkFec ;
   private boolean n10954Vts_FecF ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P04DV2_A10954Vts_FecF ;
   private boolean[] P04DV2_n10954Vts_FecF ;
   private String[] P04DV2_A396EmprCod ;
   private String[] P04DV2_A10940Vts_Nbarca ;
   private String[] P04DV2_A10951Vts_Rgto ;
}

final  class aperrccstks__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04DV2", "SELECT Vts_FecF, EmprCod, Vts_Nbarca, Vts_Rgto FROM TXPVTS002 WHERE (EmprCod = ?) AND (Not (Vts_FecF = TO_DATE('0001-01-01', 'YYYY-MM-DD'))) ORDER BY EmprCod, Vts_Nbarca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04DV3", "UPDATE TXPCCSTKS SET CCStkFec=?  WHERE EmprCod = ? and CCStkBar = ? and CCStkReo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

