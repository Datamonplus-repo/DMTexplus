package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptdisdef extends GXProcedure
{
   public ptdisdef( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptdisdef.class ), "" );
   }

   public ptdisdef( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      ptdisdef.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      ptdisdef.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptdisdef.this.AV8AlbRecCod = aP1[0];
      this.aP1 = aP1;
      ptdisdef.this.AV9DisCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Notrec = (byte)(0) ;
      /* Using cursor P01SR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5206Nr_albrecc = P01SR2_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P01SR2_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P01SR2_A5198Nr_codigo[0] ;
         AV10Nr_Codigo = A5198Nr_codigo ;
         AV11Num_d = (short)(0) ;
         AV13Notrec = (byte)(1) ;
         /* Optimized group. */
         /* Using cursor P01SR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV10Nr_Codigo)});
         cV11Num_d = P01SR3_AV11Num_d[0] ;
         pr_default.close(1);
         AV11Num_d = (short)(AV11Num_d+cV11Num_d*1) ;
         /* End optimized group. */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ( AV11Num_d == 0 ) && ( AV13Notrec == 1 ) )
      {
         /*
            INSERT RECORD ON TABLE TXPDISDEF

         */
         A361DisCod = AV9DisCod ;
         A833TipDefCod = (short)(9999) ;
         A319DefPor = (short)(100) ;
         /* Using cursor P01SR4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Short.valueOf(A833TipDefCod), Short.valueOf(A319DefPor)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      else
      {
         /* Using cursor P01SR5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV8AlbRecCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A5206Nr_albrecc = P01SR5_A5206Nr_albrecc[0] ;
            n5206Nr_albrecc = P01SR5_n5206Nr_albrecc[0] ;
            A5198Nr_codigo = P01SR5_A5198Nr_codigo[0] ;
            W396EmprCod = A396EmprCod ;
            AV10Nr_Codigo = A5198Nr_codigo ;
            /* Using cursor P01SR6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV10Nr_Codigo)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A833TipDefCod = P01SR6_A833TipDefCod[0] ;
               A5198Nr_codigo = P01SR6_A5198Nr_codigo[0] ;
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
               /* Using cursor P01SR7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Short.valueOf(A833TipDefCod), Short.valueOf(A319DefPor)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
               if ( (pr_default.getStatus(5) == 1) )
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
               pr_default.readNext(4);
            }
            pr_default.close(4);
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptdisdef.this.A396EmprCod;
      this.aP1[0] = ptdisdef.this.AV8AlbRecCod;
      this.aP2[0] = ptdisdef.this.AV9DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptdisdef");
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
      P01SR2_A396EmprCod = new String[] {""} ;
      P01SR2_A5206Nr_albrecc = new int[1] ;
      P01SR2_n5206Nr_albrecc = new boolean[] {false} ;
      P01SR2_A5198Nr_codigo = new int[1] ;
      P01SR3_AV11Num_d = new short[1] ;
      Gx_emsg = "" ;
      P01SR5_A396EmprCod = new String[] {""} ;
      P01SR5_A5206Nr_albrecc = new int[1] ;
      P01SR5_n5206Nr_albrecc = new boolean[] {false} ;
      P01SR5_A5198Nr_codigo = new int[1] ;
      W396EmprCod = "" ;
      P01SR6_A396EmprCod = new String[] {""} ;
      P01SR6_A833TipDefCod = new short[1] ;
      P01SR6_A5198Nr_codigo = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptdisdef__default(),
         new Object[] {
             new Object[] {
            P01SR2_A396EmprCod, P01SR2_A5206Nr_albrecc, P01SR2_n5206Nr_albrecc, P01SR2_A5198Nr_codigo
            }
            , new Object[] {
            P01SR3_AV11Num_d
            }
            , new Object[] {
            }
            , new Object[] {
            P01SR5_A396EmprCod, P01SR5_A5206Nr_albrecc, P01SR5_n5206Nr_albrecc, P01SR5_A5198Nr_codigo
            }
            , new Object[] {
            P01SR6_A396EmprCod, P01SR6_A833TipDefCod, P01SR6_A5198Nr_codigo
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13Notrec ;
   private short AV11Num_d ;
   private short cV11Num_d ;
   private short A833TipDefCod ;
   private short A319DefPor ;
   private short Gx_err ;
   private short W833TipDefCod ;
   private int AV8AlbRecCod ;
   private int AV9DisCod ;
   private int A5206Nr_albrecc ;
   private int A5198Nr_codigo ;
   private int AV10Nr_Codigo ;
   private int GX_INS37 ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private String W396EmprCod ;
   private boolean n5206Nr_albrecc ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01SR2_A396EmprCod ;
   private int[] P01SR2_A5206Nr_albrecc ;
   private boolean[] P01SR2_n5206Nr_albrecc ;
   private int[] P01SR2_A5198Nr_codigo ;
   private short[] P01SR3_AV11Num_d ;
   private String[] P01SR5_A396EmprCod ;
   private int[] P01SR5_A5206Nr_albrecc ;
   private boolean[] P01SR5_n5206Nr_albrecc ;
   private int[] P01SR5_A5198Nr_codigo ;
   private String[] P01SR6_A396EmprCod ;
   private short[] P01SR6_A833TipDefCod ;
   private int[] P01SR6_A5198Nr_codigo ;
}

final  class ptdisdef__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01SR2", "SELECT EmprCod, Nr_albrecc, Nr_codigo FROM TXPNOTREC WHERE EmprCod = ? and Nr_albrecc = ? ORDER BY EmprCod, Nr_albrecc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01SR3", "SELECT COUNT(*) FROM TXPNOTRE1 WHERE EmprCod = ? and Nr_codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01SR4", "INSERT INTO TXPDISDEF(EmprCod, DisCod, TipDefCod, DefPor, DefMaqcod, DefCausa, DefResp) VALUES(?, ?, ?, ?, ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISDEF")
         ,new ForEachCursor("P01SR5", "SELECT EmprCod, Nr_albrecc, Nr_codigo FROM TXPNOTREC WHERE EmprCod = ? and Nr_albrecc = ? ORDER BY EmprCod, Nr_albrecc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01SR6", "SELECT EmprCod, TipDefCod, Nr_codigo FROM TXPNOTRE1 WHERE EmprCod = ? and Nr_codigo = ? ORDER BY EmprCod, Nr_codigo, TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01SR7", "INSERT INTO TXPDISDEF(EmprCod, DisCod, TipDefCod, DefPor, DefMaqcod, DefCausa, DefResp) VALUES(?, ?, ?, ?, ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISDEF")
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 4 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

