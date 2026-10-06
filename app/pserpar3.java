package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pserpar3 extends GXProcedure
{
   public pserpar3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pserpar3.class ), "" );
   }

   public pserpar3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 ,
                             byte[] aP7 )
   {
      pserpar3.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        short[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 )
   {
      pserpar3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pserpar3.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pserpar3.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pserpar3.this.A758ProCod = aP3[0];
      this.aP3 = aP3;
      pserpar3.this.AV18Fascod = aP4[0];
      this.aP4 = aP4;
      pserpar3.this.AV14Par_art = aP5[0];
      this.aP5 = aP5;
      pserpar3.this.AV12Par_nvar = aP6[0];
      this.aP6 = aP6;
      pserpar3.this.AV13FlagR = aP7[0];
      this.aP7 = aP7;
      pserpar3.this.Gx_msg = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13FlagR = (byte)(0) ;
      Gx_msg = " " ;
      /* Using cursor P04052 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, AV18Fascod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P04052_A457FasCod[0] ;
         A1664ParFasCod = P04052_A1664ParFasCod[0] ;
         A460FasDsc = P04052_A460FasDsc[0] ;
         A460FasDsc = P04052_A460FasDsc[0] ;
         AV15Parfascod = A1664ParFasCod ;
         /* Execute user subroutine: 'PARFAS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV16Parnvar == AV12Par_nvar )
         {
            AV13FlagR = (byte)(1) ;
            Gx_msg = httpContext.getMessage( "Error.Este N Variable ", "") + GXutil.str( AV16Parnvar, 4, 0) + httpContext.getMessage( " ya existe en Fase ", "") + A457FasCod + " " + A460FasDsc + " " + GXutil.str( A1664ParFasCod, 4, 0) + " " + GXutil.trim( AV17ParFasDsc) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PARFAS' Routine */
      returnInSub = false ;
      AV16Parnvar = (short)(0) ;
      /* Using cursor P04053 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(AV15Parfascod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1664ParFasCod = P04053_A1664ParFasCod[0] ;
         A10584ParNVar = P04053_A10584ParNVar[0] ;
         n10584ParNVar = P04053_n10584ParNVar[0] ;
         A1665ParFasDsc = P04053_A1665ParFasDsc[0] ;
         n1665ParFasDsc = P04053_n1665ParFasDsc[0] ;
         AV16Parnvar = A10584ParNVar ;
         AV17ParFasDsc = A1665ParFasDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pserpar3.this.A396EmprCod;
      this.aP1[0] = pserpar3.this.A252CliCod;
      this.aP2[0] = pserpar3.this.A65ArtCod;
      this.aP3[0] = pserpar3.this.A758ProCod;
      this.aP4[0] = pserpar3.this.AV18Fascod;
      this.aP5[0] = pserpar3.this.AV14Par_art;
      this.aP6[0] = pserpar3.this.AV12Par_nvar;
      this.aP7[0] = pserpar3.this.AV13FlagR;
      this.aP8[0] = pserpar3.this.Gx_msg;
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
      P04052_A396EmprCod = new String[] {""} ;
      P04052_A252CliCod = new int[1] ;
      P04052_A65ArtCod = new String[] {""} ;
      P04052_A758ProCod = new String[] {""} ;
      P04052_A457FasCod = new String[] {""} ;
      P04052_A1664ParFasCod = new short[1] ;
      P04052_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV17ParFasDsc = "" ;
      P04053_A396EmprCod = new String[] {""} ;
      P04053_A1664ParFasCod = new short[1] ;
      P04053_A10584ParNVar = new short[1] ;
      P04053_n10584ParNVar = new boolean[] {false} ;
      P04053_A1665ParFasDsc = new String[] {""} ;
      P04053_n1665ParFasDsc = new boolean[] {false} ;
      A1665ParFasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pserpar3__default(),
         new Object[] {
             new Object[] {
            P04052_A396EmprCod, P04052_A252CliCod, P04052_A65ArtCod, P04052_A758ProCod, P04052_A457FasCod, P04052_A1664ParFasCod, P04052_A460FasDsc
            }
            , new Object[] {
            P04053_A396EmprCod, P04053_A1664ParFasCod, P04053_A10584ParNVar, P04053_n10584ParNVar, P04053_A1665ParFasDsc, P04053_n1665ParFasDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13FlagR ;
   private short AV14Par_art ;
   private short AV12Par_nvar ;
   private short A1664ParFasCod ;
   private short AV15Parfascod ;
   private short AV16Parnvar ;
   private short A10584ParNVar ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String AV18Fascod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV17ParFasDsc ;
   private String A1665ParFasDsc ;
   private boolean returnInSub ;
   private boolean n10584ParNVar ;
   private boolean n1665ParFasDsc ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private short[] aP6 ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P04052_A396EmprCod ;
   private int[] P04052_A252CliCod ;
   private String[] P04052_A65ArtCod ;
   private String[] P04052_A758ProCod ;
   private String[] P04052_A457FasCod ;
   private short[] P04052_A1664ParFasCod ;
   private String[] P04052_A460FasDsc ;
   private String[] P04053_A396EmprCod ;
   private short[] P04053_A1664ParFasCod ;
   private short[] P04053_A10584ParNVar ;
   private boolean[] P04053_n10584ParNVar ;
   private String[] P04053_A1665ParFasDsc ;
   private boolean[] P04053_n1665ParFasDsc ;
}

final  class pserpar3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04052", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.FasCod, T1.ParFasCod, T2.FasDsc FROM (TXPSERPAR T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ?) AND (T1.FasCod <> ?) ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04053", "SELECT EmprCod, ParFasCod, ParNVar, ParFasDsc FROM TXPPARFAS WHERE EmprCod = ? and ParFasCod = ? ORDER BY EmprCod, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

