package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnueopt extends GXProcedure
{
   public pnueopt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnueopt.class ), "" );
   }

   public pnueopt( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             java.util.Date[] aP10 )
   {
      pnueopt.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        java.util.Date[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             java.util.Date[] aP10 ,
                             String[] aP11 )
   {
      pnueopt.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pnueopt.this.AV16MaqCod = aP1[0];
      this.aP1 = aP1;
      pnueopt.this.AV17BarCod = aP2[0];
      this.aP2 = aP2;
      pnueopt.this.AV18BarCodReo = aP3[0];
      this.aP3 = aP3;
      pnueopt.this.AV19BarCodPar = aP4[0];
      this.aP4 = aP4;
      pnueopt.this.AV20OpeCod = aP5[0];
      this.aP5 = aP5;
      pnueopt.this.AV21FasCod = aP6[0];
      this.aP6 = aP6;
      pnueopt.this.AV22BarOrdLin = aP7[0];
      this.aP7 = aP7;
      pnueopt.this.AV23ParCod = aP8[0];
      this.aP8 = aP8;
      pnueopt.this.AV24Tiempo = aP9[0];
      this.aP9 = aP9;
      pnueopt.this.AV25Hoy = aP10[0];
      this.aP10 = aP10;
      pnueopt.this.AV26LecTipEnt = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27BarCod2 = AV17BarCod ;
      AV28CodReo = AV18BarCodReo ;
      AV29Codpar = AV19BarCodPar ;
      if ( GXutil.strcmp(AV26LecTipEnt, httpContext.getMessage( "G", "")) == 0 )
      {
         if ( (0==AV23ParCod) )
         {
            GXv_char1[0] = AV15EmprCod ;
            GXv_char2[0] = AV16MaqCod ;
            GXv_int3[0] = AV27BarCod2 ;
            GXv_int4[0] = AV28CodReo ;
            GXv_char5[0] = AV29Codpar ;
            new app.pmingru(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_int4, GXv_char5) ;
            pnueopt.this.AV15EmprCod = GXv_char1[0] ;
            pnueopt.this.AV16MaqCod = GXv_char2[0] ;
            pnueopt.this.AV27BarCod2 = GXv_int3[0] ;
            pnueopt.this.AV28CodReo = GXv_int4[0] ;
            pnueopt.this.AV29Codpar = GXv_char5[0] ;
         }
         else
         {
            GXv_char5[0] = AV15EmprCod ;
            GXv_char2[0] = AV16MaqCod ;
            GXv_int3[0] = AV27BarCod2 ;
            GXv_int4[0] = AV28CodReo ;
            GXv_char1[0] = AV29Codpar ;
            new app.pmingr0(remoteHandle, context).execute( GXv_char5, GXv_char2, GXv_int3, GXv_int4, GXv_char1) ;
            pnueopt.this.AV15EmprCod = GXv_char5[0] ;
            pnueopt.this.AV16MaqCod = GXv_char2[0] ;
            pnueopt.this.AV27BarCod2 = GXv_int3[0] ;
            pnueopt.this.AV28CodReo = GXv_int4[0] ;
            pnueopt.this.AV29Codpar = GXv_char1[0] ;
         }
      }
      /*
         INSERT RECORD ON TABLE TXPLECTOR

      */
      A396EmprCod = AV15EmprCod ;
      A1166LecMaqCod = AV16MaqCod ;
      A1167LecBarCod = AV27BarCod2 ;
      n1167LecBarCod = false ;
      A1168LecBarReo = AV28CodReo ;
      n1168LecBarReo = false ;
      A1169LecBarPar = AV29Codpar ;
      n1169LecBarPar = false ;
      A1170LecOpeCod = AV20OpeCod ;
      n1170LecOpeCod = false ;
      A1171LecFasCod = AV21FasCod ;
      n1171LecFasCod = false ;
      A1188LecFasOrd = AV22BarOrdLin ;
      n1188LecFasOrd = false ;
      A1172LecParCod = AV23ParCod ;
      n1172LecParCod = false ;
      A1173LecHor = AV24Tiempo ;
      n1173LecHor = false ;
      A1174LecFec = AV25Hoy ;
      n1174LecFec = false ;
      A1796LecTipEnt = AV26LecTipEnt ;
      n1796LecTipEnt = false ;
      /* Using cursor P007E2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1166LecMaqCod, Boolean.valueOf(n1167LecBarCod), Integer.valueOf(A1167LecBarCod), Boolean.valueOf(n1168LecBarReo), Byte.valueOf(A1168LecBarReo), Boolean.valueOf(n1169LecBarPar), A1169LecBarPar, Boolean.valueOf(n1170LecOpeCod), Integer.valueOf(A1170LecOpeCod), Boolean.valueOf(n1171LecFasCod), A1171LecFasCod, Boolean.valueOf(n1172LecParCod), Short.valueOf(A1172LecParCod), Boolean.valueOf(n1173LecHor), A1173LecHor, Boolean.valueOf(n1174LecFec), A1174LecFec, Boolean.valueOf(n1188LecFasOrd), Short.valueOf(A1188LecFasOrd), Boolean.valueOf(n1796LecTipEnt), A1796LecTipEnt});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECTOR");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         n1796LecTipEnt = false ;
         n1174LecFec = false ;
         n1173LecHor = false ;
         n1172LecParCod = false ;
         n1188LecFasOrd = false ;
         n1171LecFasCod = false ;
         n1170LecOpeCod = false ;
         n1169LecBarPar = false ;
         n1168LecBarReo = false ;
         n1167LecBarCod = false ;
         /* Optimized UPDATE. */
         /* Using cursor P007E3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n1796LecTipEnt), AV26LecTipEnt, Boolean.valueOf(n1174LecFec), AV25Hoy, Boolean.valueOf(n1173LecHor), AV24Tiempo, Boolean.valueOf(n1172LecParCod), Short.valueOf(AV23ParCod), Boolean.valueOf(n1188LecFasOrd), Short.valueOf(AV22BarOrdLin), Boolean.valueOf(n1171LecFasCod), AV21FasCod, Boolean.valueOf(n1170LecOpeCod), Integer.valueOf(AV20OpeCod), Boolean.valueOf(n1169LecBarPar), AV29Codpar, Boolean.valueOf(n1168LecBarReo), Byte.valueOf(AV28CodReo), Boolean.valueOf(n1167LecBarCod), Integer.valueOf(AV27BarCod2), A396EmprCod, A1166LecMaqCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECTOR");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      Gx_msg = httpContext.getMessage( "&LecTipEnt =", "") + AV26LecTipEnt + GXutil.newLine( ) + httpContext.getMessage( "&BarCod2   =", "") + GXutil.str( AV27BarCod2, 8, 0) + GXutil.newLine( ) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnueopt.this.AV15EmprCod;
      this.aP1[0] = pnueopt.this.AV16MaqCod;
      this.aP2[0] = pnueopt.this.AV17BarCod;
      this.aP3[0] = pnueopt.this.AV18BarCodReo;
      this.aP4[0] = pnueopt.this.AV19BarCodPar;
      this.aP5[0] = pnueopt.this.AV20OpeCod;
      this.aP6[0] = pnueopt.this.AV21FasCod;
      this.aP7[0] = pnueopt.this.AV22BarOrdLin;
      this.aP8[0] = pnueopt.this.AV23ParCod;
      this.aP9[0] = pnueopt.this.AV24Tiempo;
      this.aP10[0] = pnueopt.this.AV25Hoy;
      this.aP11[0] = pnueopt.this.AV26LecTipEnt;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnueopt");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29Codpar = "" ;
      GXv_char5 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char1 = new String[1] ;
      A396EmprCod = "" ;
      A1166LecMaqCod = "" ;
      A1169LecBarPar = "" ;
      A1171LecFasCod = "" ;
      A1173LecHor = "" ;
      A1174LecFec = GXutil.nullDate() ;
      A1796LecTipEnt = "" ;
      Gx_emsg = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnueopt__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18BarCodReo ;
   private byte AV28CodReo ;
   private byte GXv_int4[] ;
   private byte A1168LecBarReo ;
   private short AV22BarOrdLin ;
   private short AV23ParCod ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short Gx_err ;
   private int AV17BarCod ;
   private int AV20OpeCod ;
   private int AV27BarCod2 ;
   private int GXv_int3[] ;
   private int GX_INS156 ;
   private int A1167LecBarCod ;
   private int A1170LecOpeCod ;
   private String AV15EmprCod ;
   private String AV16MaqCod ;
   private String AV19BarCodPar ;
   private String AV21FasCod ;
   private String AV24Tiempo ;
   private String AV26LecTipEnt ;
   private String AV29Codpar ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String A396EmprCod ;
   private String A1166LecMaqCod ;
   private String A1169LecBarPar ;
   private String A1171LecFasCod ;
   private String A1173LecHor ;
   private String A1796LecTipEnt ;
   private String Gx_emsg ;
   private String Gx_msg ;
   private java.util.Date AV25Hoy ;
   private java.util.Date A1174LecFec ;
   private boolean n1167LecBarCod ;
   private boolean n1168LecBarReo ;
   private boolean n1169LecBarPar ;
   private boolean n1170LecOpeCod ;
   private boolean n1171LecFasCod ;
   private boolean n1188LecFasOrd ;
   private boolean n1172LecParCod ;
   private boolean n1173LecHor ;
   private boolean n1174LecFec ;
   private boolean n1796LecTipEnt ;
   private String[] aP11 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private java.util.Date[] aP10 ;
   private IDataStoreProvider pr_default ;
}

final  class pnueopt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P007E2", "INSERT INTO TXPLECTOR(EmprCod, LecMaqCod, LecBarCod, LecBarReo, LecBarPar, LecOpeCod, LecFasCod, LecParCod, LecHor, LecFec, LecFasOrd, LecTipEnt, LecNumLot, LecRecLinM, LecCombin, LecCnc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLECTOR")
         ,new UpdateCursor("P007E3", "UPDATE TXPLECTOR SET LecTipEnt=?, LecFec=?, LecHor=?, LecParCod=?, LecFasOrd=?, LecFasCod=?, LecOpeCod=?, LecBarPar=?, LecBarReo=?, LecBarCod=?  WHERE EmprCod = ? and LecMaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLECTOR")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 8);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[15], 8);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[21], 1);
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 8);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
               }
               stmt.setString(11, (String)parms[20], 3);
               stmt.setString(12, (String)parms[21], 6);
               return;
      }
   }

}

