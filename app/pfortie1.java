package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfortie1 extends GXProcedure
{
   public pfortie1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfortie1.class ), "" );
   }

   public pfortie1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 )
   {
      pfortie1.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pfortie1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfortie1.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pfortie1.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pfortie1.this.A758ProCod = aP3[0];
      this.aP3 = aP3;
      pfortie1.this.A457FasCod = aP4[0];
      this.aP4 = aP4;
      pfortie1.this.AV8TiempoT = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01O92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4898ArtProCod = P01O92_A4898ArtProCod[0] ;
         A4897ArtProLin = P01O92_A4897ArtProLin[0] ;
         /* Optimized group. */
         /* Using cursor P01O93 */
         pr_default.execute(1, new Object[] {A396EmprCod, A4898ArtProCod});
         c771ProForTie = P01O93_A771ProForTie[0] ;
         pr_default.close(1);
         AV8TiempoT = (short)(AV8TiempoT+c771ProForTie) ;
         /* End optimized group. */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfortie1.this.A396EmprCod;
      this.aP1[0] = pfortie1.this.A252CliCod;
      this.aP2[0] = pfortie1.this.A65ArtCod;
      this.aP3[0] = pfortie1.this.A758ProCod;
      this.aP4[0] = pfortie1.this.A457FasCod;
      this.aP5[0] = pfortie1.this.AV8TiempoT;
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
      P01O92_A396EmprCod = new String[] {""} ;
      P01O92_A252CliCod = new int[1] ;
      P01O92_A65ArtCod = new String[] {""} ;
      P01O92_A758ProCod = new String[] {""} ;
      P01O92_A457FasCod = new String[] {""} ;
      P01O92_A4898ArtProCod = new String[] {""} ;
      P01O92_A4897ArtProLin = new short[1] ;
      A4898ArtProCod = "" ;
      P01O93_A771ProForTie = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfortie1__default(),
         new Object[] {
             new Object[] {
            P01O92_A396EmprCod, P01O92_A252CliCod, P01O92_A65ArtCod, P01O92_A758ProCod, P01O92_A457FasCod, P01O92_A4898ArtProCod, P01O92_A4897ArtProLin
            }
            , new Object[] {
            P01O93_A771ProForTie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8TiempoT ;
   private short A4897ArtProLin ;
   private short c771ProForTie ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String scmdbuf ;
   private String A4898ArtProCod ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01O92_A396EmprCod ;
   private int[] P01O92_A252CliCod ;
   private String[] P01O92_A65ArtCod ;
   private String[] P01O92_A758ProCod ;
   private String[] P01O92_A457FasCod ;
   private String[] P01O92_A4898ArtProCod ;
   private short[] P01O92_A4897ArtProLin ;
   private short[] P01O93_A771ProForTie ;
}

final  class pfortie1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01O92", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProCod, ArtProLin FROM TXPArtFor WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01O93", "SELECT SUM(ProForTie) FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

