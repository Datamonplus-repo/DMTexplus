package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdefdish extends GXProcedure
{
   public pdefdish( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdefdish.class ), "" );
   }

   public pdefdish( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 )
   {
      pdefdish.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      pdefdish.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdefdish.this.AV13PartCod = aP1[0];
      this.aP1 = aP1;
      pdefdish.this.AV14CliCod = aP2[0];
      this.aP2 = aP2;
      pdefdish.this.AV9DisCod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02RQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV13PartCod, Integer.valueOf(AV14CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7090Nr_PartCod = P02RQ2_A7090Nr_PartCod[0] ;
         n7090Nr_PartCod = P02RQ2_n7090Nr_PartCod[0] ;
         A5340Nr_CliCod = P02RQ2_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P02RQ2_n5340Nr_CliCod[0] ;
         A5198Nr_codigo = P02RQ2_A5198Nr_codigo[0] ;
         AV10Nr_Codigo = A5198Nr_codigo ;
         AV11Num_d = (short)(0) ;
         /* Optimized group. */
         /* Using cursor P02RQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV10Nr_Codigo)});
         cV11Num_d = P02RQ3_AV11Num_d[0] ;
         pr_default.close(1);
         AV11Num_d = (short)(AV11Num_d+cV11Num_d*1) ;
         /* End optimized group. */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P02RQ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV13PartCod, Integer.valueOf(AV14CliCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A7090Nr_PartCod = P02RQ4_A7090Nr_PartCod[0] ;
         n7090Nr_PartCod = P02RQ4_n7090Nr_PartCod[0] ;
         A5340Nr_CliCod = P02RQ4_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P02RQ4_n5340Nr_CliCod[0] ;
         A5198Nr_codigo = P02RQ4_A5198Nr_codigo[0] ;
         W396EmprCod = A396EmprCod ;
         AV10Nr_Codigo = A5198Nr_codigo ;
         /* Using cursor P02RQ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV10Nr_Codigo)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A833TipDefCod = P02RQ5_A833TipDefCod[0] ;
            A5198Nr_codigo = P02RQ5_A5198Nr_codigo[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE TXPDISDEF

            */
            W396EmprCod = A396EmprCod ;
            W833TipDefCod = A833TipDefCod ;
            A361DisCod = AV9DisCod ;
            if ( AV11Num_d > 0 )
            {
               A319DefPor = (short)(100/ (double) (AV11Num_d)) ;
            }
            /* Using cursor P02RQ6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Short.valueOf(A833TipDefCod), Short.valueOf(A319DefPor)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
            if ( (pr_default.getStatus(4) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A833TipDefCod = W833TipDefCod ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdefdish.this.A396EmprCod;
      this.aP1[0] = pdefdish.this.AV13PartCod;
      this.aP2[0] = pdefdish.this.AV14CliCod;
      this.aP3[0] = pdefdish.this.AV9DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdefdish");
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
      P02RQ2_A396EmprCod = new String[] {""} ;
      P02RQ2_A7090Nr_PartCod = new String[] {""} ;
      P02RQ2_n7090Nr_PartCod = new boolean[] {false} ;
      P02RQ2_A5340Nr_CliCod = new int[1] ;
      P02RQ2_n5340Nr_CliCod = new boolean[] {false} ;
      P02RQ2_A5198Nr_codigo = new int[1] ;
      A7090Nr_PartCod = "" ;
      P02RQ3_AV11Num_d = new short[1] ;
      P02RQ4_A396EmprCod = new String[] {""} ;
      P02RQ4_A7090Nr_PartCod = new String[] {""} ;
      P02RQ4_n7090Nr_PartCod = new boolean[] {false} ;
      P02RQ4_A5340Nr_CliCod = new int[1] ;
      P02RQ4_n5340Nr_CliCod = new boolean[] {false} ;
      P02RQ4_A5198Nr_codigo = new int[1] ;
      W396EmprCod = "" ;
      P02RQ5_A396EmprCod = new String[] {""} ;
      P02RQ5_A833TipDefCod = new short[1] ;
      P02RQ5_A5198Nr_codigo = new int[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdefdish__default(),
         new Object[] {
             new Object[] {
            P02RQ2_A396EmprCod, P02RQ2_A7090Nr_PartCod, P02RQ2_n7090Nr_PartCod, P02RQ2_A5340Nr_CliCod, P02RQ2_n5340Nr_CliCod, P02RQ2_A5198Nr_codigo
            }
            , new Object[] {
            P02RQ3_AV11Num_d
            }
            , new Object[] {
            P02RQ4_A396EmprCod, P02RQ4_A7090Nr_PartCod, P02RQ4_n7090Nr_PartCod, P02RQ4_A5340Nr_CliCod, P02RQ4_n5340Nr_CliCod, P02RQ4_A5198Nr_codigo
            }
            , new Object[] {
            P02RQ5_A396EmprCod, P02RQ5_A833TipDefCod, P02RQ5_A5198Nr_codigo
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11Num_d ;
   private short cV11Num_d ;
   private short A833TipDefCod ;
   private short W833TipDefCod ;
   private short A319DefPor ;
   private short Gx_err ;
   private int AV14CliCod ;
   private int AV9DisCod ;
   private int A5340Nr_CliCod ;
   private int A5198Nr_codigo ;
   private int AV10Nr_Codigo ;
   private int GX_INS37 ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String AV13PartCod ;
   private String scmdbuf ;
   private String A7090Nr_PartCod ;
   private String W396EmprCod ;
   private String Gx_emsg ;
   private boolean n7090Nr_PartCod ;
   private boolean n5340Nr_CliCod ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02RQ2_A396EmprCod ;
   private String[] P02RQ2_A7090Nr_PartCod ;
   private boolean[] P02RQ2_n7090Nr_PartCod ;
   private int[] P02RQ2_A5340Nr_CliCod ;
   private boolean[] P02RQ2_n5340Nr_CliCod ;
   private int[] P02RQ2_A5198Nr_codigo ;
   private short[] P02RQ3_AV11Num_d ;
   private String[] P02RQ4_A396EmprCod ;
   private String[] P02RQ4_A7090Nr_PartCod ;
   private boolean[] P02RQ4_n7090Nr_PartCod ;
   private int[] P02RQ4_A5340Nr_CliCod ;
   private boolean[] P02RQ4_n5340Nr_CliCod ;
   private int[] P02RQ4_A5198Nr_codigo ;
   private String[] P02RQ5_A396EmprCod ;
   private short[] P02RQ5_A833TipDefCod ;
   private int[] P02RQ5_A5198Nr_codigo ;
}

final  class pdefdish__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02RQ2", "SELECT EmprCod, Nr_PartCod, Nr_CliCod, Nr_codigo FROM TXPNOTREC WHERE EmprCod = ? and Nr_PartCod = ? and Nr_CliCod = ? ORDER BY EmprCod, Nr_PartCod, Nr_CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02RQ3", "SELECT COUNT(*) FROM TXPNOTRE1 WHERE EmprCod = ? and Nr_codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02RQ4", "SELECT EmprCod, Nr_PartCod, Nr_CliCod, Nr_codigo FROM TXPNOTREC WHERE EmprCod = ? and Nr_PartCod = ? and Nr_CliCod = ? ORDER BY EmprCod, Nr_PartCod, Nr_CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02RQ5", "SELECT EmprCod, TipDefCod, Nr_codigo FROM TXPNOTRE1 WHERE EmprCod = ? and Nr_codigo = ? ORDER BY EmprCod, Nr_codigo, TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02RQ6", "INSERT INTO TXPDISDEF(EmprCod, DisCod, TipDefCod, DefPor, DefMaqcod, DefCausa, DefResp) VALUES(?, ?, ?, ?, ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISDEF")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

