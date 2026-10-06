package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pparttej extends GXProcedure
{
   public pparttej( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pparttej.class ), "" );
   }

   public pparttej( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pparttej.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pparttej.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pparttej.this.AV15Clicod = aP1[0];
      this.aP1 = aP1;
      pparttej.this.AV16ArtCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV17Tab_clArt[GX_I-1] = 0 ;
         GX_I = (int)(GX_I+1) ;
      }
      AV18i = (short)(1) ;
      AV20Num_r = 0 ;
      /* Using cursor P037T2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV16ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P037T2_A65ArtCod[0] ;
         A252CliCod = P037T2_A252CliCod[0] ;
         if ( A252CliCod != AV15Clicod )
         {
            if ( AV18i > 1000 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Maximo 1000 Clientes ¡¡¡", ""));
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            if ( A252CliCod > 0 )
            {
               AV17Tab_clArt[AV18i-1] = A252CliCod ;
               AV18i = (short)(AV18i+1) ;
               AV20Num_r = (int)(AV20Num_r+1) ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gx_msg = httpContext.getMessage( "Registros a procesar.. ", "") + GXutil.str( AV20Num_r, 6, 0) ;
      System.out.println( Gx_msg );
      AV18i = (short)(1) ;
      while ( AV18i <= 1000 )
      {
         if ( AV17Tab_clArt[AV18i-1] == 0 )
         {
            if (true) break;
         }
         AV19Clicodd = AV17Tab_clArt[AV18i-1] ;
         /* Optimized DELETE. */
         /* Using cursor P037T3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV19Clicodd), AV16ArtCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTTEJ");
         /* End optimized DELETE. */
         AV18i = (short)(AV18i+1) ;
      }
      AV18i = (short)(1) ;
      while ( AV18i <= 1000 )
      {
         if ( AV17Tab_clArt[AV18i-1] == 0 )
         {
            if (true) break;
         }
         AV19Clicodd = AV17Tab_clArt[AV18i-1] ;
         /* Using cursor P037T4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV15Clicod), AV16ArtCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A65ArtCod = P037T4_A65ArtCod[0] ;
            A252CliCod = P037T4_A252CliCod[0] ;
            A10566Par_TFcA = P037T4_A10566Par_TFcA[0] ;
            n10566Par_TFcA = P037T4_n10566Par_TFcA[0] ;
            A10565Par_TUsA = P037T4_A10565Par_TUsA[0] ;
            n10565Par_TUsA = P037T4_n10565Par_TUsA[0] ;
            A10564Par_TFcM = P037T4_A10564Par_TFcM[0] ;
            n10564Par_TFcM = P037T4_n10564Par_TFcM[0] ;
            A10563Par_TUsM = P037T4_A10563Par_TUsM[0] ;
            n10563Par_TUsM = P037T4_n10563Par_TUsM[0] ;
            A7955Par_ObsTj = P037T4_A7955Par_ObsTj[0] ;
            n7955Par_ObsTj = P037T4_n7955Par_ObsTj[0] ;
            A7954Par_ValTj = P037T4_A7954Par_ValTj[0] ;
            n7954Par_ValTj = P037T4_n7954Par_ValTj[0] ;
            A7949Par_Art = P037T4_A7949Par_Art[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            /*
               INSERT RECORD ON TABLE TXPARTTEJ

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W7949Par_Art = A7949Par_Art ;
            A252CliCod = AV19Clicodd ;
            A65ArtCod = AV16ArtCod ;
            /* Using cursor P037T5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A7949Par_Art), Boolean.valueOf(n7954Par_ValTj), A7954Par_ValTj, Boolean.valueOf(n7955Par_ObsTj), A7955Par_ObsTj, Boolean.valueOf(n10563Par_TUsM), A10563Par_TUsM, Boolean.valueOf(n10564Par_TFcM), A10564Par_TFcM, Boolean.valueOf(n10565Par_TUsA), A10565Par_TUsA, Boolean.valueOf(n10566Par_TFcA), A10566Par_TFcA});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTTEJ");
            if ( (pr_default.getStatus(3) == 1) )
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
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            A7949Par_Art = W7949Par_Art ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV18i = (short)(AV18i+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pparttej.this.A396EmprCod;
      this.aP1[0] = pparttej.this.AV15Clicod;
      this.aP2[0] = pparttej.this.AV16ArtCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pparttej");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Tab_clArt = new int[1000] ;
      scmdbuf = "" ;
      P037T2_A396EmprCod = new String[] {""} ;
      P037T2_A65ArtCod = new String[] {""} ;
      P037T2_A252CliCod = new int[1] ;
      A65ArtCod = "" ;
      Gx_msg = "" ;
      P037T4_A396EmprCod = new String[] {""} ;
      P037T4_A65ArtCod = new String[] {""} ;
      P037T4_A252CliCod = new int[1] ;
      P037T4_A10566Par_TFcA = new java.util.Date[] {GXutil.nullDate()} ;
      P037T4_n10566Par_TFcA = new boolean[] {false} ;
      P037T4_A10565Par_TUsA = new String[] {""} ;
      P037T4_n10565Par_TUsA = new boolean[] {false} ;
      P037T4_A10564Par_TFcM = new java.util.Date[] {GXutil.nullDate()} ;
      P037T4_n10564Par_TFcM = new boolean[] {false} ;
      P037T4_A10563Par_TUsM = new String[] {""} ;
      P037T4_n10563Par_TUsM = new boolean[] {false} ;
      P037T4_A7955Par_ObsTj = new String[] {""} ;
      P037T4_n7955Par_ObsTj = new boolean[] {false} ;
      P037T4_A7954Par_ValTj = new String[] {""} ;
      P037T4_n7954Par_ValTj = new boolean[] {false} ;
      P037T4_A7949Par_Art = new short[1] ;
      A10566Par_TFcA = GXutil.resetTime( GXutil.nullDate() );
      A10565Par_TUsA = "" ;
      A10564Par_TFcM = GXutil.resetTime( GXutil.nullDate() );
      A10563Par_TUsM = "" ;
      A7955Par_ObsTj = "" ;
      A7954Par_ValTj = "" ;
      W396EmprCod = "" ;
      W65ArtCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pparttej__default(),
         new Object[] {
             new Object[] {
            P037T2_A396EmprCod, P037T2_A65ArtCod, P037T2_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P037T4_A396EmprCod, P037T4_A65ArtCod, P037T4_A252CliCod, P037T4_A10566Par_TFcA, P037T4_n10566Par_TFcA, P037T4_A10565Par_TUsA, P037T4_n10565Par_TUsA, P037T4_A10564Par_TFcM, P037T4_n10564Par_TFcM, P037T4_A10563Par_TUsM,
            P037T4_n10563Par_TUsM, P037T4_A7955Par_ObsTj, P037T4_n7955Par_ObsTj, P037T4_A7954Par_ValTj, P037T4_n7954Par_ValTj, P037T4_A7949Par_Art
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV18i ;
   private short A7949Par_Art ;
   private short W7949Par_Art ;
   private short Gx_err ;
   private int AV15Clicod ;
   private int GX_I ;
   private int AV17Tab_clArt[] ;
   private int AV20Num_r ;
   private int A252CliCod ;
   private int AV19Clicodd ;
   private int W252CliCod ;
   private int GX_INS1112 ;
   private String A396EmprCod ;
   private String AV16ArtCod ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String Gx_msg ;
   private String A10565Par_TUsA ;
   private String A10563Par_TUsM ;
   private String A7954Par_ValTj ;
   private String W396EmprCod ;
   private String W65ArtCod ;
   private String Gx_emsg ;
   private java.util.Date A10566Par_TFcA ;
   private java.util.Date A10564Par_TFcM ;
   private boolean n10566Par_TFcA ;
   private boolean n10565Par_TUsA ;
   private boolean n10564Par_TFcM ;
   private boolean n10563Par_TUsM ;
   private boolean n7955Par_ObsTj ;
   private boolean n7954Par_ValTj ;
   private String A7955Par_ObsTj ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P037T2_A396EmprCod ;
   private String[] P037T2_A65ArtCod ;
   private int[] P037T2_A252CliCod ;
   private String[] P037T4_A396EmprCod ;
   private String[] P037T4_A65ArtCod ;
   private int[] P037T4_A252CliCod ;
   private java.util.Date[] P037T4_A10566Par_TFcA ;
   private boolean[] P037T4_n10566Par_TFcA ;
   private String[] P037T4_A10565Par_TUsA ;
   private boolean[] P037T4_n10565Par_TUsA ;
   private java.util.Date[] P037T4_A10564Par_TFcM ;
   private boolean[] P037T4_n10564Par_TFcM ;
   private String[] P037T4_A10563Par_TUsM ;
   private boolean[] P037T4_n10563Par_TUsM ;
   private String[] P037T4_A7955Par_ObsTj ;
   private boolean[] P037T4_n7955Par_ObsTj ;
   private String[] P037T4_A7954Par_ValTj ;
   private boolean[] P037T4_n7954Par_ValTj ;
   private short[] P037T4_A7949Par_Art ;
}

final  class pparttej__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P037T2", "SELECT EmprCod, ArtCod, CliCod FROM TXPARTICU WHERE EmprCod = ? and ArtCod = ? ORDER BY EmprCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037T3", "DELETE FROM TXPARTTEJ  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTTEJ")
         ,new ForEachCursor("P037T4", "SELECT EmprCod, ArtCod, CliCod, Par_TFcA, Par_TUsA, Par_TFcM, Par_TUsM, Par_ObsTj, Par_ValTj, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Par_Art ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037T5", "INSERT INTO TXPARTTEJ(EmprCod, CliCod, ArtCod, Par_Art, Par_ValTj, Par_ObsTj, Par_TUsM, Par_TFcM, Par_TUsA, Par_TFcA) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTTEJ")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 40);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 400);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[11], false);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 10);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[15], false);
               }
               return;
      }
   }

}

