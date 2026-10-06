package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apjln013 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apjln013 pgm = new apjln013 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apjln013( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apjln013.class ), "" );
   }

   public apjln013( int remoteHandle ,
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
      /* Using cursor P01192 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01192_A130BarCodPar[0] ;
         A132BarCodReo = P01192_A132BarCodReo[0] ;
         A129BarCod = P01192_A129BarCod[0] ;
         A396EmprCod = P01192_A396EmprCod[0] ;
         A213BarSit = P01192_A213BarSit[0] ;
         A120BarAgrEst = P01192_A120BarAgrEst[0] ;
         A3595BarMacCod = P01192_A3595BarMacCod[0] ;
         A120BarAgrEst = httpContext.getMessage( "N", "") ;
         AV10FlagAgrEst = (byte)(0) ;
         /* Using cursor P01193 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A119BarAgrCod = P01193_A119BarAgrCod[0] ;
            A124BarAgrReo = P01193_A124BarAgrReo[0] ;
            A122BarAgrPar = P01193_A122BarAgrPar[0] ;
            AV10FlagAgrEst = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV10FlagAgrEst == 1 )
         {
            A120BarAgrEst = httpContext.getMessage( "S", "") ;
         }
         AV11BarCodMin = A129BarCod ;
         AV12BarReoMin = A132BarCodReo ;
         AV13BarParMin = A130BarCodPar ;
         A3595BarMacCod = AV11BarCodMin ;
         new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV11BarCodMin, AV12BarReoMin, AV13BarParMin) ;
         if ( ( A129BarCod == AV11BarCodMin ) && ( A132BarCodReo == AV12BarReoMin ) && ( GXutil.strcmp(A130BarCodPar, AV13BarParMin) == 0 ) )
         {
            A3595BarMacCod = AV11BarCodMin ;
         }
         Gx_msg = httpContext.getMessage( "Hdr= ", "") + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( "Agrupada= ", "") + A120BarAgrEst + httpContext.getMessage( "Minima= ", "") + GXutil.str( AV11BarCodMin, 8, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P01194 */
         pr_default.execute(2, new Object[] {A120BarAgrEst, Integer.valueOf(A3595BarMacCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pjln013.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apjln013");
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
      P01192_A130BarCodPar = new String[] {""} ;
      P01192_A132BarCodReo = new byte[1] ;
      P01192_A129BarCod = new int[1] ;
      P01192_A396EmprCod = new String[] {""} ;
      P01192_A213BarSit = new byte[1] ;
      P01192_A120BarAgrEst = new String[] {""} ;
      P01192_A3595BarMacCod = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A120BarAgrEst = "" ;
      P01193_A396EmprCod = new String[] {""} ;
      P01193_A129BarCod = new int[1] ;
      P01193_A132BarCodReo = new byte[1] ;
      P01193_A130BarCodPar = new String[] {""} ;
      P01193_A119BarAgrCod = new int[1] ;
      P01193_A124BarAgrReo = new byte[1] ;
      P01193_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      AV13BarParMin = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apjln013__default(),
         new Object[] {
             new Object[] {
            P01192_A130BarCodPar, P01192_A132BarCodReo, P01192_A129BarCod, P01192_A396EmprCod, P01192_A213BarSit, P01192_A120BarAgrEst, P01192_A3595BarMacCod
            }
            , new Object[] {
            P01193_A396EmprCod, P01193_A129BarCod, P01193_A132BarCodReo, P01193_A130BarCodPar, P01193_A119BarAgrCod, P01193_A124BarAgrReo, P01193_A122BarAgrPar
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV10FlagAgrEst ;
   private byte A124BarAgrReo ;
   private byte AV12BarReoMin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A3595BarMacCod ;
   private int A119BarAgrCod ;
   private int AV11BarCodMin ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A120BarAgrEst ;
   private String A122BarAgrPar ;
   private String AV13BarParMin ;
   private String Gx_msg ;
   private IDataStoreProvider pr_default ;
   private String[] P01192_A130BarCodPar ;
   private byte[] P01192_A132BarCodReo ;
   private int[] P01192_A129BarCod ;
   private String[] P01192_A396EmprCod ;
   private byte[] P01192_A213BarSit ;
   private String[] P01192_A120BarAgrEst ;
   private int[] P01192_A3595BarMacCod ;
   private String[] P01193_A396EmprCod ;
   private int[] P01193_A129BarCod ;
   private byte[] P01193_A132BarCodReo ;
   private String[] P01193_A130BarCodPar ;
   private int[] P01193_A119BarAgrCod ;
   private byte[] P01193_A124BarAgrReo ;
   private String[] P01193_A122BarAgrPar ;
}

final  class apjln013__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01192", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSit, BarAgrEst, BarMacCod FROM TXPBARCAD WHERE BarSit <= 11 ORDER BY EmprCod, BarSit ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01193", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01194", "UPDATE TXPBARCAD SET BarAgrEst=?, BarMacCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

