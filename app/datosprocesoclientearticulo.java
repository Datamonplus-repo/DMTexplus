package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class datosprocesoclientearticulo extends GXProcedure
{
   public datosprocesoclientearticulo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( datosprocesoclientearticulo.class ), "" );
   }

   public datosprocesoclientearticulo( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            String aP2 ,
                            String[] aP3 ,
                            String[] aP4 ,
                            String[] aP5 )
   {
      datosprocesoclientearticulo.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 )
   {
      datosprocesoclientearticulo.this.A396EmprCod = aP0;
      datosprocesoclientearticulo.this.A252CliCod = aP1;
      datosprocesoclientearticulo.this.A65ArtCod = aP2;
      datosprocesoclientearticulo.this.aP3 = aP3;
      datosprocesoclientearticulo.this.aP4 = aP4;
      datosprocesoclientearticulo.this.aP5 = aP5;
      datosprocesoclientearticulo.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ArtProcod = " " ;
      AV10ProCod = " " ;
      AV11ProDsc = " " ;
      AV12Proact = " " ;
      AV13NProc = (short)(0) ;
      /* Using cursor P0A9D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A759ProDsc = P0A9D2_A759ProDsc[0] ;
         A758ProCod = P0A9D2_A758ProCod[0] ;
         A759ProDsc = P0A9D2_A759ProDsc[0] ;
         if ( AV13NProc == 0 )
         {
            AV10ProCod = A758ProCod ;
            AV8ArtProcod = " " ;
            /* Execute user subroutine: 'ACS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV10ProCod = A758ProCod ;
            AV11ProDsc = A759ProDsc ;
         }
         AV13NProc = (short)(AV13NProc+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'ACS' Routine */
      returnInSub = false ;
      AV8ArtProcod = " " ;
      /* Using cursor P0A9D3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, AV10ProCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A758ProCod = P0A9D3_A758ProCod[0] ;
         A4898ArtProCod = P0A9D3_A4898ArtProCod[0] ;
         A457FasCod = P0A9D3_A457FasCod[0] ;
         A4897ArtProLin = P0A9D3_A4897ArtProLin[0] ;
         AV8ArtProcod = A4898ArtProCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = datosprocesoclientearticulo.this.AV8ArtProcod;
      this.aP4[0] = datosprocesoclientearticulo.this.AV10ProCod;
      this.aP5[0] = datosprocesoclientearticulo.this.AV11ProDsc;
      this.aP6[0] = datosprocesoclientearticulo.this.AV13NProc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8ArtProcod = "" ;
      AV10ProCod = "" ;
      AV11ProDsc = "" ;
      AV12Proact = "" ;
      scmdbuf = "" ;
      P0A9D2_A396EmprCod = new String[] {""} ;
      P0A9D2_A252CliCod = new int[1] ;
      P0A9D2_A65ArtCod = new String[] {""} ;
      P0A9D2_A759ProDsc = new String[] {""} ;
      P0A9D2_A758ProCod = new String[] {""} ;
      A759ProDsc = "" ;
      A758ProCod = "" ;
      P0A9D3_A396EmprCod = new String[] {""} ;
      P0A9D3_A252CliCod = new int[1] ;
      P0A9D3_A65ArtCod = new String[] {""} ;
      P0A9D3_A758ProCod = new String[] {""} ;
      P0A9D3_A4898ArtProCod = new String[] {""} ;
      P0A9D3_A457FasCod = new String[] {""} ;
      P0A9D3_A4897ArtProLin = new short[1] ;
      A4898ArtProCod = "" ;
      A457FasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.datosprocesoclientearticulo__default(),
         new Object[] {
             new Object[] {
            P0A9D2_A396EmprCod, P0A9D2_A252CliCod, P0A9D2_A65ArtCod, P0A9D2_A759ProDsc, P0A9D2_A758ProCod
            }
            , new Object[] {
            P0A9D3_A396EmprCod, P0A9D3_A252CliCod, P0A9D3_A65ArtCod, P0A9D3_A758ProCod, P0A9D3_A4898ArtProCod, P0A9D3_A457FasCod, P0A9D3_A4897ArtProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV13NProc ;
   private short A4897ArtProLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV8ArtProcod ;
   private String AV10ProCod ;
   private String AV11ProDsc ;
   private String AV12Proact ;
   private String scmdbuf ;
   private String A759ProDsc ;
   private String A758ProCod ;
   private String A4898ArtProCod ;
   private String A457FasCod ;
   private boolean returnInSub ;
   private short[] aP6 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A9D2_A396EmprCod ;
   private int[] P0A9D2_A252CliCod ;
   private String[] P0A9D2_A65ArtCod ;
   private String[] P0A9D2_A759ProDsc ;
   private String[] P0A9D2_A758ProCod ;
   private String[] P0A9D3_A396EmprCod ;
   private int[] P0A9D3_A252CliCod ;
   private String[] P0A9D3_A65ArtCod ;
   private String[] P0A9D3_A758ProCod ;
   private String[] P0A9D3_A4898ArtProCod ;
   private String[] P0A9D3_A457FasCod ;
   private short[] P0A9D3_A4897ArtProLin ;
}

final  class datosprocesoclientearticulo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9D2", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T2.ProDsc, T1.ProCod FROM (TXPARTLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9D3", "SELECT EmprCod, CliCod, ArtCod, ProCod, ArtProCod, FasCod, ArtProLin FROM TXPArtFor WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
      }
   }

}

