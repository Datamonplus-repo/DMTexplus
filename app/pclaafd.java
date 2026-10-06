package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaafd extends GXProcedure
{
   public pclaafd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaafd.class ), "" );
   }

   public pclaafd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           byte[] aP3 ,
                           int[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           String[] aP6 ,
                           String[] aP7 )
   {
      pclaafd.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 )
   {
      pclaafd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaafd.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclaafd.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclaafd.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclaafd.this.AV112DisCod = aP4[0];
      this.aP4 = aP4;
      pclaafd.this.AV21TotKil = aP5[0];
      this.aP5 = aP5;
      pclaafd.this.AV22PrdDesc = aP6[0];
      this.aP6 = aP6;
      pclaafd.this.AV23Accion = aP7[0];
      this.aP7 = aP7;
      pclaafd.this.AV111Opi = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Fibra = GXutil.substring( AV16Clave, 4, 3) ;
      AV23Accion = GXutil.substring( AV16Clave, 8, 1) ;
      /* Using cursor P026H2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV112DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P026H2_A361DisCod[0] ;
         A355DisArtTr3 = P026H2_A355DisArtTr3[0] ;
         A354DisArtTr2 = P026H2_A354DisArtTr2[0] ;
         A353DisArtTr1 = P026H2_A353DisArtTr1[0] ;
         if ( ( GXutil.strcmp(A353DisArtTr1, AV25Fibra) == 0 ) || ( GXutil.strcmp(A354DisArtTr2, AV25Fibra) == 0 ) || ( GXutil.strcmp(A355DisArtTr3, AV25Fibra) == 0 ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaafd.this.A396EmprCod;
      this.aP1[0] = pclaafd.this.AV15Descrip;
      this.aP2[0] = pclaafd.this.AV16Clave;
      this.aP3[0] = pclaafd.this.AV17PrdVal;
      this.aP4[0] = pclaafd.this.AV112DisCod;
      this.aP5[0] = pclaafd.this.AV21TotKil;
      this.aP6[0] = pclaafd.this.AV22PrdDesc;
      this.aP7[0] = pclaafd.this.AV23Accion;
      this.aP8[0] = pclaafd.this.AV111Opi;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25Fibra = "" ;
      scmdbuf = "" ;
      P026H2_A396EmprCod = new String[] {""} ;
      P026H2_A361DisCod = new int[1] ;
      P026H2_A355DisArtTr3 = new String[] {""} ;
      P026H2_A354DisArtTr2 = new String[] {""} ;
      P026H2_A353DisArtTr1 = new String[] {""} ;
      A355DisArtTr3 = "" ;
      A354DisArtTr2 = "" ;
      A353DisArtTr1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaafd__default(),
         new Object[] {
             new Object[] {
            P026H2_A396EmprCod, P026H2_A361DisCod, P026H2_A355DisArtTr3, P026H2_A354DisArtTr2, P026H2_A353DisArtTr1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV111Opi ;
   private short Gx_err ;
   private int AV112DisCod ;
   private int A361DisCod ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV25Fibra ;
   private String scmdbuf ;
   private String A355DisArtTr3 ;
   private String A354DisArtTr2 ;
   private String A353DisArtTr1 ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P026H2_A396EmprCod ;
   private int[] P026H2_A361DisCod ;
   private String[] P026H2_A355DisArtTr3 ;
   private String[] P026H2_A354DisArtTr2 ;
   private String[] P026H2_A353DisArtTr1 ;
}

final  class pclaafd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P026H2", "SELECT EmprCod, DisCod, DisArtTr3, DisArtTr2, DisArtTr1 FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
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
               return;
      }
   }

}

