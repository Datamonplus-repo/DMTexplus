package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkilmacl extends GXProcedure
{
   public pkilmacl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkilmacl.class ), "" );
   }

   public pkilmacl( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 )
   {
      pkilmacl.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 )
   {
      pkilmacl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkilmacl.this.AV8Maccod = aP1[0];
      this.aP1 = aP1;
      pkilmacl.this.AV9maclin = aP2[0];
      this.aP2 = aP2;
      pkilmacl.this.AV10BarCod = aP3[0];
      this.aP3 = aP3;
      pkilmacl.this.AV11BarCodreo = aP4[0];
      this.aP4 = aP4;
      pkilmacl.this.AV12BarCodPar = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV13NoBaragr) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOBARG", ""), GXv_int2) ;
      pkilmacl.this.GXt_int1 = GXv_int2[0] ;
      AV13NoBaragr = GXt_int1 ;
      GXt_int1 = (byte)(AV14Indutexma) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INDUTE", ""), GXv_int2) ;
      pkilmacl.this.GXt_int1 = GXv_int2[0] ;
      AV14Indutexma = GXt_int1 ;
      GXt_char3 = AV15Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      pkilmacl.this.GXt_char3 = GXv_char4[0] ;
      AV15Station = GXt_char3 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = AV16EmprNom ;
      GXv_char6[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char4, GXv_char5, GXv_char6) ;
      pkilmacl.this.A396EmprCod = GXv_char4[0] ;
      pkilmacl.this.AV16EmprNom = GXv_char5[0] ;
      pkilmacl.this.AV17UsurCod = GXv_char6[0] ;
      /* Using cursor P089U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodreo), AV12BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P089U2_A130BarCodPar[0] ;
         A132BarCodReo = P089U2_A132BarCodReo[0] ;
         A129BarCod = P089U2_A129BarCod[0] ;
         A213BarSit = P089U2_A213BarSit[0] ;
         A120BarAgrEst = P089U2_A120BarAgrEst[0] ;
         AV18RecMaq = (short)(0) ;
         if ( A213BarSit == 4 )
         {
            AV19BarCodm = A129BarCod ;
            AV20BarCodReom = A132BarCodReo ;
            AV21BarCodParm = A130BarCodPar ;
            if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV19BarCodm, AV20BarCodReom, AV21BarCodParm) ;
            }
            /* Execute user subroutine: 'RECMAQ' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18RecMaq == 1 )
      {
         Gx_msg = httpContext.getMessage( "Atencion. NO se puede eliminar esta linea.", "") + GXutil.newLine( ) + httpContext.getMessage( "Existe Receta Quimica.", "") + GXutil.newLine( ) + httpContext.getMessage( "Contactar con el responsable de Tinte.", "") + GXutil.newLine( ) ;
         httpContext.GX_msglist.addItem(Gx_msg);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV13NoBaragr == 0 )
      {
         AV23messages.clear();
         /* Using cursor P089U3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodreo), AV12BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P089U3_A130BarCodPar[0] ;
            A132BarCodReo = P089U3_A132BarCodReo[0] ;
            A129BarCod = P089U3_A129BarCod[0] ;
            A590KgmAgr = P089U3_A590KgmAgr[0] ;
            A122BarAgrPar = P089U3_A122BarAgrPar[0] ;
            A124BarAgrReo = P089U3_A124BarAgrReo[0] ;
            A119BarAgrCod = P089U3_A119BarAgrCod[0] ;
            /* Using cursor P089U4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
            AV24message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV24message.setgxTv_SdtMessages_Message_Id( GXutil.str( AV10BarCod, 8, 0)+"-"+GXutil.str( AV11BarCodreo, 1, 0)+AV12BarCodPar );
            AV24message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Eliminacion BarAgr, Agrupada con", "")+GXutil.str( A119BarAgrCod, 8, 0)+"-"+GXutil.str( A124BarAgrReo, 1, 0)+A122BarAgrPar );
            AV23messages.add(AV24message, 0);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV23messages.size() > 0 )
         {
            AV25messagesJson = AV23messages.toJSonString(false) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV31Pgmname, AV17UsurCod, AV15Station, AV25messagesJson, AV10BarCod, AV11BarCodreo, AV12BarCodPar) ;
         }
         /* Optimized DELETE. */
         /* Using cursor P089U5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodreo), AV12BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
         /* End optimized DELETE. */
         AV23messages.clear();
         /* Using cursor P089U6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodreo), AV12BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A130BarCodPar = P089U6_A130BarCodPar[0] ;
            A132BarCodReo = P089U6_A132BarCodReo[0] ;
            A129BarCod = P089U6_A129BarCod[0] ;
            A120BarAgrEst = P089U6_A120BarAgrEst[0] ;
            A3595BarMacCod = P089U6_A3595BarMacCod[0] ;
            A120BarAgrEst = httpContext.getMessage( "N", "") ;
            A3595BarMacCod = ((AV14Indutexma==1) ? 0 : A3595BarMacCod) ;
            AV24message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV24message.setgxTv_SdtMessages_Message_Id( GXutil.str( AV10BarCod, 8, 0)+"-"+GXutil.str( AV11BarCodreo, 1, 0)+AV12BarCodPar );
            AV24message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Actualizo BARCAD. ", "")+httpContext.getMessage( "BarAgrEst ", "")+httpContext.getMessage( "N", "")+httpContext.getMessage( " BarMaccod ", "")+GXutil.str( A3595BarMacCod, 8, 0) );
            AV23messages.add(AV24message, 0);
            /* Using cursor P089U7 */
            pr_default.execute(5, new Object[] {A120BarAgrEst, Integer.valueOf(A3595BarMacCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         if ( AV23messages.size() > 0 )
         {
            AV25messagesJson = AV23messages.toJSonString(false) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV31Pgmname, AV17UsurCod, AV15Station, AV25messagesJson, AV10BarCod, AV11BarCodreo, AV12BarCodPar) ;
         }
      }
      /* Optimized DELETE. */
      /* Using cursor P089U8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV8Maccod), Short.valueOf(AV9maclin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
      /* End optimized DELETE. */
      cleanup();
   }

   public void S111( )
   {
      /* 'RECMAQ' Routine */
      returnInSub = false ;
      AV18RecMaq = (short)(0) ;
      /* Using cursor P089U9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV19BarCodm), Byte.valueOf(AV20BarCodReom), AV21BarCodParm});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A130BarCodPar = P089U9_A130BarCodPar[0] ;
         A132BarCodReo = P089U9_A132BarCodReo[0] ;
         A129BarCod = P089U9_A129BarCod[0] ;
         A2805RecVolPrd = P089U9_A2805RecVolPrd[0] ;
         A2804RecLinMaq = P089U9_A2804RecLinMaq[0] ;
         AV18RecMaq = (short)(1) ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkilmacl.this.A396EmprCod;
      this.aP1[0] = pkilmacl.this.AV8Maccod;
      this.aP2[0] = pkilmacl.this.AV9maclin;
      this.aP3[0] = pkilmacl.this.AV10BarCod;
      this.aP4[0] = pkilmacl.this.AV11BarCodreo;
      this.aP5[0] = pkilmacl.this.AV12BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkilmacl");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV15Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char5 = new String[1] ;
      AV17UsurCod = "" ;
      GXv_char6 = new String[1] ;
      scmdbuf = "" ;
      P089U2_A396EmprCod = new String[] {""} ;
      P089U2_A130BarCodPar = new String[] {""} ;
      P089U2_A132BarCodReo = new byte[1] ;
      P089U2_A129BarCod = new int[1] ;
      P089U2_A213BarSit = new byte[1] ;
      P089U2_A120BarAgrEst = new String[] {""} ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      AV21BarCodParm = "" ;
      Gx_msg = "" ;
      AV23messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      P089U3_A396EmprCod = new String[] {""} ;
      P089U3_A130BarCodPar = new String[] {""} ;
      P089U3_A132BarCodReo = new byte[1] ;
      P089U3_A129BarCod = new int[1] ;
      P089U3_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P089U3_A122BarAgrPar = new String[] {""} ;
      P089U3_A124BarAgrReo = new byte[1] ;
      P089U3_A119BarAgrCod = new int[1] ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A122BarAgrPar = "" ;
      AV24message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV25messagesJson = "" ;
      AV31Pgmname = "" ;
      P089U6_A396EmprCod = new String[] {""} ;
      P089U6_A130BarCodPar = new String[] {""} ;
      P089U6_A132BarCodReo = new byte[1] ;
      P089U6_A129BarCod = new int[1] ;
      P089U6_A120BarAgrEst = new String[] {""} ;
      P089U6_A3595BarMacCod = new int[1] ;
      P089U9_A396EmprCod = new String[] {""} ;
      P089U9_A130BarCodPar = new String[] {""} ;
      P089U9_A132BarCodReo = new byte[1] ;
      P089U9_A129BarCod = new int[1] ;
      P089U9_A2805RecVolPrd = new int[1] ;
      P089U9_A2804RecLinMaq = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkilmacl__default(),
         new Object[] {
             new Object[] {
            P089U2_A396EmprCod, P089U2_A130BarCodPar, P089U2_A132BarCodReo, P089U2_A129BarCod, P089U2_A213BarSit, P089U2_A120BarAgrEst
            }
            , new Object[] {
            P089U3_A396EmprCod, P089U3_A130BarCodPar, P089U3_A132BarCodReo, P089U3_A129BarCod, P089U3_A590KgmAgr, P089U3_A122BarAgrPar, P089U3_A124BarAgrReo, P089U3_A119BarAgrCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P089U6_A396EmprCod, P089U6_A130BarCodPar, P089U6_A132BarCodReo, P089U6_A129BarCod, P089U6_A120BarAgrEst, P089U6_A3595BarMacCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P089U9_A396EmprCod, P089U9_A130BarCodPar, P089U9_A132BarCodReo, P089U9_A129BarCod, P089U9_A2805RecVolPrd, P089U9_A2804RecLinMaq
            }
         }
      );
      AV31Pgmname = "pKILMACL" ;
      /* GeneXus formulas. */
      AV31Pgmname = "pKILMACL" ;
      Gx_err = (short)(0) ;
   }

   private byte AV11BarCodreo ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV20BarCodReom ;
   private byte A124BarAgrReo ;
   private short AV9maclin ;
   private short AV13NoBaragr ;
   private short AV14Indutexma ;
   private short AV18RecMaq ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV8Maccod ;
   private int AV10BarCod ;
   private int A129BarCod ;
   private int AV19BarCodm ;
   private int A119BarAgrCod ;
   private int A3595BarMacCod ;
   private int A2805RecVolPrd ;
   private java.math.BigDecimal A590KgmAgr ;
   private String A396EmprCod ;
   private String AV12BarCodPar ;
   private String AV15Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV16EmprNom ;
   private String GXv_char5[] ;
   private String AV17UsurCod ;
   private String GXv_char6[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String AV21BarCodParm ;
   private String Gx_msg ;
   private String A122BarAgrPar ;
   private String AV31Pgmname ;
   private boolean returnInSub ;
   private String AV25messagesJson ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P089U2_A396EmprCod ;
   private String[] P089U2_A130BarCodPar ;
   private byte[] P089U2_A132BarCodReo ;
   private int[] P089U2_A129BarCod ;
   private byte[] P089U2_A213BarSit ;
   private String[] P089U2_A120BarAgrEst ;
   private String[] P089U3_A396EmprCod ;
   private String[] P089U3_A130BarCodPar ;
   private byte[] P089U3_A132BarCodReo ;
   private int[] P089U3_A129BarCod ;
   private java.math.BigDecimal[] P089U3_A590KgmAgr ;
   private String[] P089U3_A122BarAgrPar ;
   private byte[] P089U3_A124BarAgrReo ;
   private int[] P089U3_A119BarAgrCod ;
   private String[] P089U6_A396EmprCod ;
   private String[] P089U6_A130BarCodPar ;
   private byte[] P089U6_A132BarCodReo ;
   private int[] P089U6_A129BarCod ;
   private String[] P089U6_A120BarAgrEst ;
   private int[] P089U6_A3595BarMacCod ;
   private String[] P089U9_A396EmprCod ;
   private String[] P089U9_A130BarCodPar ;
   private byte[] P089U9_A132BarCodReo ;
   private int[] P089U9_A129BarCod ;
   private int[] P089U9_A2805RecVolPrd ;
   private short[] P089U9_A2804RecLinMaq ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV23messages ;
   private com.genexus.SdtMessages_Message AV24message ;
}

final  class pkilmacl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P089U2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSit, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P089U3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P089U4", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new UpdateCursor("P089U5", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? and BarAgrCod = ? and BarAgrReo = ? and BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new ForEachCursor("P089U6", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarAgrEst, BarMacCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P089U7", "UPDATE TXPBARCAD SET BarAgrEst=?, BarMacCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P089U8", "DELETE FROM TXPLMACRO  WHERE EmprCod = ? and MacCod = ? and MacLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMACRO")
         ,new ForEachCursor("P089U9", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, RecVolPrd, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

