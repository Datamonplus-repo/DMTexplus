package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfarttr extends GXProcedure
{
   public pfarttr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfarttr.class ), "" );
   }

   public pfarttr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pfarttr.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pfarttr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfarttr.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pfarttr.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pfarttr.this.AV8ForNomCli3 = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ForNomCli3 = "" ;
      /* Using cursor P02ZS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A105ArtTra1 = P02ZS2_A105ArtTra1[0] ;
         n105ArtTra1 = P02ZS2_n105ArtTra1[0] ;
         A108ArtTraP1 = P02ZS2_A108ArtTraP1[0] ;
         n108ArtTraP1 = P02ZS2_n108ArtTraP1[0] ;
         A106ArtTra2 = P02ZS2_A106ArtTra2[0] ;
         n106ArtTra2 = P02ZS2_n106ArtTra2[0] ;
         A109ArtTraP2 = P02ZS2_A109ArtTraP2[0] ;
         n109ArtTraP2 = P02ZS2_n109ArtTraP2[0] ;
         A107ArtTra3 = P02ZS2_A107ArtTra3[0] ;
         n107ArtTra3 = P02ZS2_n107ArtTra3[0] ;
         A110ArtTraP3 = P02ZS2_A110ArtTraP3[0] ;
         n110ArtTraP3 = P02ZS2_n110ArtTraP3[0] ;
         AV8ForNomCli3 += GXutil.trim( A105ArtTra1) ;
         AV8ForNomCli3 += "-" ;
         AV8ForNomCli3 += GXutil.trim( GXutil.str( A108ArtTraP1, 3, 0)) ;
         AV8ForNomCli3 += "-" ;
         AV8ForNomCli3 += GXutil.trim( A106ArtTra2) ;
         AV8ForNomCli3 += "-" ;
         AV8ForNomCli3 += GXutil.trim( GXutil.str( A109ArtTraP2, 3, 0)) ;
         AV8ForNomCli3 += "-" ;
         AV8ForNomCli3 += GXutil.trim( A107ArtTra3) ;
         AV8ForNomCli3 += "-" ;
         AV8ForNomCli3 += GXutil.trim( GXutil.str( A110ArtTraP3, 3, 0)) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfarttr.this.A396EmprCod;
      this.aP1[0] = pfarttr.this.A252CliCod;
      this.aP2[0] = pfarttr.this.A65ArtCod;
      this.aP3[0] = pfarttr.this.AV8ForNomCli3;
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
      P02ZS2_A396EmprCod = new String[] {""} ;
      P02ZS2_A252CliCod = new int[1] ;
      P02ZS2_A65ArtCod = new String[] {""} ;
      P02ZS2_A105ArtTra1 = new String[] {""} ;
      P02ZS2_n105ArtTra1 = new boolean[] {false} ;
      P02ZS2_A108ArtTraP1 = new short[1] ;
      P02ZS2_n108ArtTraP1 = new boolean[] {false} ;
      P02ZS2_A106ArtTra2 = new String[] {""} ;
      P02ZS2_n106ArtTra2 = new boolean[] {false} ;
      P02ZS2_A109ArtTraP2 = new short[1] ;
      P02ZS2_n109ArtTraP2 = new boolean[] {false} ;
      P02ZS2_A107ArtTra3 = new String[] {""} ;
      P02ZS2_n107ArtTra3 = new boolean[] {false} ;
      P02ZS2_A110ArtTraP3 = new short[1] ;
      P02ZS2_n110ArtTraP3 = new boolean[] {false} ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfarttr__default(),
         new Object[] {
             new Object[] {
            P02ZS2_A396EmprCod, P02ZS2_A252CliCod, P02ZS2_A65ArtCod, P02ZS2_A105ArtTra1, P02ZS2_n105ArtTra1, P02ZS2_A108ArtTraP1, P02ZS2_n108ArtTraP1, P02ZS2_A106ArtTra2, P02ZS2_n106ArtTra2, P02ZS2_A109ArtTraP2,
            P02ZS2_n109ArtTraP2, P02ZS2_A107ArtTra3, P02ZS2_n107ArtTra3, P02ZS2_A110ArtTraP3, P02ZS2_n110ArtTraP3
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV8ForNomCli3 ;
   private String scmdbuf ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private boolean n105ArtTra1 ;
   private boolean n108ArtTraP1 ;
   private boolean n106ArtTra2 ;
   private boolean n109ArtTraP2 ;
   private boolean n107ArtTra3 ;
   private boolean n110ArtTraP3 ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02ZS2_A396EmprCod ;
   private int[] P02ZS2_A252CliCod ;
   private String[] P02ZS2_A65ArtCod ;
   private String[] P02ZS2_A105ArtTra1 ;
   private boolean[] P02ZS2_n105ArtTra1 ;
   private short[] P02ZS2_A108ArtTraP1 ;
   private boolean[] P02ZS2_n108ArtTraP1 ;
   private String[] P02ZS2_A106ArtTra2 ;
   private boolean[] P02ZS2_n106ArtTra2 ;
   private short[] P02ZS2_A109ArtTraP2 ;
   private boolean[] P02ZS2_n109ArtTraP2 ;
   private String[] P02ZS2_A107ArtTra3 ;
   private boolean[] P02ZS2_n107ArtTra3 ;
   private short[] P02ZS2_A110ArtTraP3 ;
   private boolean[] P02ZS2_n110ArtTraP3 ;
}

final  class pfarttr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02ZS2", "SELECT EmprCod, CliCod, ArtCod, ArtTra1, ArtTraP1, ArtTra2, ArtTraP2, ArtTra3, ArtTraP3 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
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
               return;
      }
   }

}

