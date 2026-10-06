package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apuotints extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apuotints pgm = new apuotints (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apuotints( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apuotints.class ), "" );
   }

   public apuotints( int remoteHandle ,
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
      AV16Num_r = 0 ;
      /* Using cursor P03592 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7843Int_Num = P03592_A7843Int_Num[0] ;
         A396EmprCod = P03592_A396EmprCod[0] ;
         A7856Int_st = P03592_A7856Int_st[0] ;
         n7856Int_st = P03592_n7856Int_st[0] ;
         AV17Emprcod = A396EmprCod ;
         AV13Int_num = A7843Int_Num ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( AV15Barcad == 1 ) && ( A7856Int_st != 2 ) )
         {
            A7856Int_st = (byte)(2) ;
            n7856Int_st = false ;
            AV16Num_r = (int)(AV16Num_r+1) ;
            Gx_msg = httpContext.getMessage( "Procesando...", "") + GXutil.str( AV16Num_r, 6, 0) ;
            System.out.println( Gx_msg );
         }
         /* Using cursor P03593 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n7856Int_st), Byte.valueOf(A7856Int_st), A396EmprCod, Integer.valueOf(A7843Int_Num)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOTINT");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin...", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV15Barcad = (byte)(0) ;
      /* Using cursor P03594 */
      pr_default.execute(2, new Object[] {AV17Emprcod, Integer.valueOf(AV13Int_num)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A129BarCod = P03594_A129BarCod[0] ;
         A396EmprCod = P03594_A396EmprCod[0] ;
         A130BarCodPar = P03594_A130BarCodPar[0] ;
         A132BarCodReo = P03594_A132BarCodReo[0] ;
         AV15Barcad = (byte)(1) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(puotints.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apuotints");
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
      P03592_A7843Int_Num = new int[1] ;
      P03592_A396EmprCod = new String[] {""} ;
      P03592_A7856Int_st = new byte[1] ;
      P03592_n7856Int_st = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV17Emprcod = "" ;
      Gx_msg = "" ;
      P03594_A129BarCod = new int[1] ;
      P03594_A396EmprCod = new String[] {""} ;
      P03594_A130BarCodPar = new String[] {""} ;
      P03594_A132BarCodReo = new byte[1] ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apuotints__default(),
         new Object[] {
             new Object[] {
            P03592_A7843Int_Num, P03592_A396EmprCod, P03592_A7856Int_st, P03592_n7856Int_st
            }
            , new Object[] {
            }
            , new Object[] {
            P03594_A129BarCod, P03594_A396EmprCod, P03594_A130BarCodPar, P03594_A132BarCodReo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A7856Int_st ;
   private byte AV15Barcad ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV16Num_r ;
   private int A7843Int_Num ;
   private int AV13Int_num ;
   private int A129BarCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV17Emprcod ;
   private String Gx_msg ;
   private String A130BarCodPar ;
   private boolean n7856Int_st ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private int[] P03592_A7843Int_Num ;
   private String[] P03592_A396EmprCod ;
   private byte[] P03592_A7856Int_st ;
   private boolean[] P03592_n7856Int_st ;
   private int[] P03594_A129BarCod ;
   private String[] P03594_A396EmprCod ;
   private String[] P03594_A130BarCodPar ;
   private byte[] P03594_A132BarCodReo ;
}

final  class apuotints__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03592", "SELECT Int_Num, EmprCod, Int_st FROM TXPOTINT WHERE EmprCod = '001' and Int_Num > 0 ORDER BY EmprCod, Int_Num ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03593", "UPDATE TXPOTINT SET Int_st=?  WHERE EmprCod = ? AND Int_Num = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOTINT")
         ,new ForEachCursor("P03594", "SELECT BarCod, EmprCod, BarCodPar, BarCodReo FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

