package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscfs extends GXProcedure
{
   public pbuscfs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscfs.class ), "" );
   }

   public pbuscfs( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 )
   {
      pbuscfs.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      pbuscfs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbuscfs.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbuscfs.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pbuscfs.this.AV8Fascod = aP3[0];
      this.aP3 = aP3;
      pbuscfs.this.AV9PrdVal = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9PrdVal = (byte)(0) ;
      /* Using cursor P038V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8084Art_RdoP = P038V2_A8084Art_RdoP[0] ;
         n8084Art_RdoP = P038V2_n8084Art_RdoP[0] ;
         A758ProCod = P038V2_A758ProCod[0] ;
         AV10Procod = A758ProCod ;
         /* Execute user subroutine: 'PROLIN' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV9PrdVal == 1 )
         {
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
      /* 'PROLIN' Routine */
      returnInSub = false ;
      /* Using cursor P038V3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV10Procod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A758ProCod = P038V3_A758ProCod[0] ;
         A457FasCod = P038V3_A457FasCod[0] ;
         A774ProNumLin = P038V3_A774ProNumLin[0] ;
         if ( GXutil.strcmp(A457FasCod, AV8Fascod) == 0 )
         {
            AV9PrdVal = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuscfs.this.A396EmprCod;
      this.aP1[0] = pbuscfs.this.A252CliCod;
      this.aP2[0] = pbuscfs.this.A65ArtCod;
      this.aP3[0] = pbuscfs.this.AV8Fascod;
      this.aP4[0] = pbuscfs.this.AV9PrdVal;
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
      P038V2_A396EmprCod = new String[] {""} ;
      P038V2_A252CliCod = new int[1] ;
      P038V2_A65ArtCod = new String[] {""} ;
      P038V2_A8084Art_RdoP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P038V2_n8084Art_RdoP = new boolean[] {false} ;
      P038V2_A758ProCod = new String[] {""} ;
      A8084Art_RdoP = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      AV10Procod = "" ;
      P038V3_A396EmprCod = new String[] {""} ;
      P038V3_A758ProCod = new String[] {""} ;
      P038V3_A457FasCod = new String[] {""} ;
      P038V3_A774ProNumLin = new short[1] ;
      A457FasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuscfs__default(),
         new Object[] {
             new Object[] {
            P038V2_A396EmprCod, P038V2_A252CliCod, P038V2_A65ArtCod, P038V2_A8084Art_RdoP, P038V2_n8084Art_RdoP, P038V2_A758ProCod
            }
            , new Object[] {
            P038V3_A396EmprCod, P038V3_A758ProCod, P038V3_A457FasCod, P038V3_A774ProNumLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9PrdVal ;
   private short A774ProNumLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal A8084Art_RdoP ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV8Fascod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String AV10Procod ;
   private String A457FasCod ;
   private boolean n8084Art_RdoP ;
   private boolean returnInSub ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P038V2_A396EmprCod ;
   private int[] P038V2_A252CliCod ;
   private String[] P038V2_A65ArtCod ;
   private java.math.BigDecimal[] P038V2_A8084Art_RdoP ;
   private boolean[] P038V2_n8084Art_RdoP ;
   private String[] P038V2_A758ProCod ;
   private String[] P038V3_A396EmprCod ;
   private String[] P038V3_A758ProCod ;
   private String[] P038V3_A457FasCod ;
   private short[] P038V3_A774ProNumLin ;
}

final  class pbuscfs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P038V2", "SELECT EmprCod, CliCod, ArtCod, Art_RdoP, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P038V3", "SELECT EmprCod, ProCod, FasCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod, ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

