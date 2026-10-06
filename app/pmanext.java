package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmanext extends GXProcedure
{
   public pmanext( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmanext.class ), "" );
   }

   public pmanext( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           byte[] aP3 )
   {
      pmanext.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 )
   {
      pmanext.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmanext.this.A313ContCod = aP1[0];
      this.aP1 = aP1;
      pmanext.this.A2253SalExtAlb = aP2[0];
      this.aP2 = aP2;
      pmanext.this.AV15FlagAlb = aP3[0];
      this.aP3 = aP3;
      pmanext.this.AV16FlagCont = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16FlagCont = (byte)(0) ;
      /* Using cursor P01ZT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A313ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A316ContVal = P01ZT2_A316ContVal[0] ;
         if ( A2253SalExtAlb > A316ContVal )
         {
            AV16FlagCont = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV15FlagAlb = (byte)(0) ;
      if ( AV16FlagCont == 0 )
      {
         /* Using cursor P01ZT3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            AV15FlagAlb = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmanext.this.A396EmprCod;
      this.aP1[0] = pmanext.this.A313ContCod;
      this.aP2[0] = pmanext.this.A2253SalExtAlb;
      this.aP3[0] = pmanext.this.AV15FlagAlb;
      this.aP4[0] = pmanext.this.AV16FlagCont;
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
      P01ZT2_A396EmprCod = new String[] {""} ;
      P01ZT2_A313ContCod = new String[] {""} ;
      P01ZT2_A316ContVal = new int[1] ;
      P01ZT3_A396EmprCod = new String[] {""} ;
      P01ZT3_A2253SalExtAlb = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmanext__default(),
         new Object[] {
             new Object[] {
            P01ZT2_A396EmprCod, P01ZT2_A313ContCod, P01ZT2_A316ContVal
            }
            , new Object[] {
            P01ZT3_A396EmprCod, P01ZT3_A2253SalExtAlb
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15FlagAlb ;
   private byte AV16FlagCont ;
   private short Gx_err ;
   private int A2253SalExtAlb ;
   private int A316ContVal ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String scmdbuf ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01ZT2_A396EmprCod ;
   private String[] P01ZT2_A313ContCod ;
   private int[] P01ZT2_A316ContVal ;
   private String[] P01ZT3_A396EmprCod ;
   private int[] P01ZT3_A2253SalExtAlb ;
}

final  class pmanext__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01ZT2", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01ZT3", "SELECT EmprCod, SalExtAlb FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

