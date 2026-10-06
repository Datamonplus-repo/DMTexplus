package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcal012 extends GXProcedure
{
   public pcal012( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcal012.class ), "" );
   }

   public pcal012( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     String[] aP1 ,
                                     byte[] aP2 ,
                                     short[] aP3 ,
                                     byte[] aP4 ,
                                     byte[] aP5 ,
                                     byte[] aP6 ,
                                     byte[] aP7 ,
                                     java.util.Date[] aP8 ,
                                     java.util.Date[] aP9 ,
                                     java.util.Date[] aP10 ,
                                     java.util.Date[] aP11 ,
                                     java.util.Date[] aP12 )
   {
      pcal012.this.aP13 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 ,
                        short[] aP3 ,
                        byte[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        byte[] aP7 ,
                        java.util.Date[] aP8 ,
                        java.util.Date[] aP9 ,
                        java.util.Date[] aP10 ,
                        java.util.Date[] aP11 ,
                        java.util.Date[] aP12 ,
                        java.util.Date[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 ,
                             short[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 ,
                             java.util.Date[] aP8 ,
                             java.util.Date[] aP9 ,
                             java.util.Date[] aP10 ,
                             java.util.Date[] aP11 ,
                             java.util.Date[] aP12 ,
                             java.util.Date[] aP13 )
   {
      pcal012.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pcal012.this.AV16MAQUINA = aP1[0];
      this.aP1 = aP1;
      pcal012.this.AV17MM = aP2[0];
      this.aP2 = aP2;
      pcal012.this.AV18AA = aP3[0];
      this.aP3 = aP3;
      pcal012.this.AV19DDINI = aP4[0];
      this.aP4 = aP4;
      pcal012.this.AV20DDFI = aP5[0];
      this.aP5 = aP5;
      pcal012.this.AV21DiaSem = aP6[0];
      this.aP6 = aP6;
      pcal012.this.AV22HNPDIA = aP7[0];
      this.aP7 = aP7;
      pcal012.this.AV30MaqHnpI1f = aP8[0];
      this.aP8 = aP8;
      pcal012.this.AV29MaqHnpI1i = aP9[0];
      this.aP9 = aP9;
      pcal012.this.AV32MaqHnpI2f = aP10[0];
      this.aP10 = aP10;
      pcal012.this.AV31MaqHnpI2i = aP11[0];
      this.aP11 = aP11;
      pcal012.this.AV34MaqHnpI3f = aP12[0];
      this.aP12 = aP12;
      pcal012.this.AV33MaqHnpI3i = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV35IntHnp ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "INTHNP", ""), GXv_int1) ;
      pcal012.this.AV35IntHnp = GXv_int1[0] ;
      if ( AV22HNPDIA == 0 )
      {
         AV24HNPCAR = "  " ;
      }
      else
      {
         AV24HNPCAR = GXutil.str( AV22HNPDIA, 2, 0) ;
      }
      /* Using cursor P04022 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV16MAQUINA, Short.valueOf(AV18AA), Byte.valueOf(AV17MM)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A614MaqMes = P04022_A614MaqMes[0] ;
         A599MaqAny = P04022_A599MaqAny[0] ;
         A602MaqCod = P04022_A602MaqCod[0] ;
         A396EmprCod = P04022_A396EmprCod[0] ;
         A610MaqHNPMes = P04022_A610MaqHNPMes[0] ;
         n610MaqHNPMes = P04022_n610MaqHNPMes[0] ;
         W396EmprCod = A396EmprCod ;
         W602MaqCod = A602MaqCod ;
         W599MaqAny = A599MaqAny ;
         W614MaqMes = A614MaqMes ;
         AV23I = AV19DDINI ;
         while ( AV23I <= AV20DDFI )
         {
            AV25I2 = (byte)(AV23I*2-1) ;
            AV26I3 = (byte)(AV23I*2+2) ;
            AV27I4 = (byte)(64-AV26I3) ;
            if ( (0==AV21DiaSem) || (0==AV21DiaSem) || ( GXutil.dow( localUtil.ymdtod( AV18AA, AV17MM, AV23I)) == AV21DiaSem ) )
            {
               A610MaqHNPMes = GXutil.substring( A610MaqHNPMes, 1, AV25I2) + AV24HNPCAR + GXutil.substring( A610MaqHNPMes, AV26I3, AV27I4) ;
               n610MaqHNPMes = false ;
               if ( AV35IntHnp == 1 )
               {
                  AV44GXLvl25 = (byte)(0) ;
                  n5128MaqHnpI3i = false ;
                  n5129MaqHnpI3f = false ;
                  n5126MaqHnpI2i = false ;
                  n5127MaqHnpI2f = false ;
                  n5124MaqHnpI1i = false ;
                  n5125MaqHnpI1f = false ;
                  /* Optimized UPDATE. */
                  /* Using cursor P04023 */
                  pr_default.execute(1, new Object[] {Boolean.valueOf(n5128MaqHnpI3i), AV33MaqHnpI3i, Boolean.valueOf(n5129MaqHnpI3f), AV34MaqHnpI3f, Boolean.valueOf(n5126MaqHnpI2i), AV31MaqHnpI2i, Boolean.valueOf(n5127MaqHnpI2f), AV32MaqHnpI2f, Boolean.valueOf(n5124MaqHnpI1i), AV29MaqHnpI1i, Boolean.valueOf(n5125MaqHnpI1f), AV30MaqHnpI1f, A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Byte.valueOf(AV23I)});
                  if ( (pr_default.getStatus(1) != 101) )
                  {
                     AV44GXLvl25 = (byte)(1) ;
                  }
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINTHNP");
                  /* End optimized UPDATE. */
                  if ( AV44GXLvl25 == 0 )
                  {
                     System.out.println( localUtil.format( DecimalUtil.doubleToDec(AV23I), "Z9") );
                     /*
                        INSERT RECORD ON TABLE TXPINTHNP

                     */
                     W396EmprCod = A396EmprCod ;
                     W602MaqCod = A602MaqCod ;
                     W599MaqAny = A599MaqAny ;
                     W614MaqMes = A614MaqMes ;
                     A396EmprCod = AV15EmprCod ;
                     A602MaqCod = AV16MAQUINA ;
                     A599MaqAny = AV18AA ;
                     A614MaqMes = AV17MM ;
                     A5123MaqHnpDia = AV23I ;
                     A5125MaqHnpI1f = AV30MaqHnpI1f ;
                     n5125MaqHnpI1f = false ;
                     A5124MaqHnpI1i = AV29MaqHnpI1i ;
                     n5124MaqHnpI1i = false ;
                     A5127MaqHnpI2f = AV32MaqHnpI2f ;
                     n5127MaqHnpI2f = false ;
                     A5126MaqHnpI2i = AV31MaqHnpI2i ;
                     n5126MaqHnpI2i = false ;
                     A5129MaqHnpI3f = AV34MaqHnpI3f ;
                     n5129MaqHnpI3f = false ;
                     A5128MaqHnpI3i = AV33MaqHnpI3i ;
                     n5128MaqHnpI3i = false ;
                     /* Using cursor P04024 */
                     pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Byte.valueOf(A5123MaqHnpDia), Boolean.valueOf(n5124MaqHnpI1i), A5124MaqHnpI1i, Boolean.valueOf(n5125MaqHnpI1f), A5125MaqHnpI1f, Boolean.valueOf(n5126MaqHnpI2i), A5126MaqHnpI2i, Boolean.valueOf(n5127MaqHnpI2f), A5127MaqHnpI2f, Boolean.valueOf(n5128MaqHnpI3i), A5128MaqHnpI3i, Boolean.valueOf(n5129MaqHnpI3f), A5129MaqHnpI3f});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINTHNP");
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
                     A396EmprCod = W396EmprCod ;
                     A602MaqCod = W602MaqCod ;
                     A599MaqAny = W599MaqAny ;
                     A614MaqMes = W614MaqMes ;
                     /* End Insert */
                  }
               }
            }
            AV23I = (byte)(AV23I+1) ;
         }
         /* Using cursor P04025 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n610MaqHNPMes), A610MaqHNPMes, A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQHNP");
         A396EmprCod = W396EmprCod ;
         A602MaqCod = W602MaqCod ;
         A599MaqAny = W599MaqAny ;
         A614MaqMes = W614MaqMes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcal012.this.AV15EmprCod;
      this.aP1[0] = pcal012.this.AV16MAQUINA;
      this.aP2[0] = pcal012.this.AV17MM;
      this.aP3[0] = pcal012.this.AV18AA;
      this.aP4[0] = pcal012.this.AV19DDINI;
      this.aP5[0] = pcal012.this.AV20DDFI;
      this.aP6[0] = pcal012.this.AV21DiaSem;
      this.aP7[0] = pcal012.this.AV22HNPDIA;
      this.aP8[0] = pcal012.this.AV30MaqHnpI1f;
      this.aP9[0] = pcal012.this.AV29MaqHnpI1i;
      this.aP10[0] = pcal012.this.AV32MaqHnpI2f;
      this.aP11[0] = pcal012.this.AV31MaqHnpI2i;
      this.aP12[0] = pcal012.this.AV34MaqHnpI3f;
      this.aP13[0] = pcal012.this.AV33MaqHnpI3i;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcal012");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      AV24HNPCAR = "" ;
      scmdbuf = "" ;
      P04022_A614MaqMes = new byte[1] ;
      P04022_A599MaqAny = new short[1] ;
      P04022_A602MaqCod = new String[] {""} ;
      P04022_A396EmprCod = new String[] {""} ;
      P04022_A610MaqHNPMes = new String[] {""} ;
      P04022_n610MaqHNPMes = new boolean[] {false} ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A610MaqHNPMes = "" ;
      W396EmprCod = "" ;
      W602MaqCod = "" ;
      A5128MaqHnpI3i = GXutil.resetTime( GXutil.nullDate() );
      A5129MaqHnpI3f = GXutil.resetTime( GXutil.nullDate() );
      A5126MaqHnpI2i = GXutil.resetTime( GXutil.nullDate() );
      A5127MaqHnpI2f = GXutil.resetTime( GXutil.nullDate() );
      A5124MaqHnpI1i = GXutil.resetTime( GXutil.nullDate() );
      A5125MaqHnpI1f = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcal012__default(),
         new Object[] {
             new Object[] {
            P04022_A614MaqMes, P04022_A599MaqAny, P04022_A602MaqCod, P04022_A396EmprCod, P04022_A610MaqHNPMes, P04022_n610MaqHNPMes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17MM ;
   private byte AV19DDINI ;
   private byte AV20DDFI ;
   private byte AV21DiaSem ;
   private byte AV22HNPDIA ;
   private byte AV35IntHnp ;
   private byte GXv_int1[] ;
   private byte A614MaqMes ;
   private byte W614MaqMes ;
   private byte AV23I ;
   private byte AV25I2 ;
   private byte AV26I3 ;
   private byte AV27I4 ;
   private byte AV44GXLvl25 ;
   private byte A5123MaqHnpDia ;
   private short AV18AA ;
   private short A599MaqAny ;
   private short W599MaqAny ;
   private short Gx_err ;
   private int GX_INS748 ;
   private String AV15EmprCod ;
   private String AV16MAQUINA ;
   private String AV24HNPCAR ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String W396EmprCod ;
   private String W602MaqCod ;
   private String Gx_emsg ;
   private java.util.Date AV30MaqHnpI1f ;
   private java.util.Date AV29MaqHnpI1i ;
   private java.util.Date AV32MaqHnpI2f ;
   private java.util.Date AV31MaqHnpI2i ;
   private java.util.Date AV34MaqHnpI3f ;
   private java.util.Date AV33MaqHnpI3i ;
   private java.util.Date A5128MaqHnpI3i ;
   private java.util.Date A5129MaqHnpI3f ;
   private java.util.Date A5126MaqHnpI2i ;
   private java.util.Date A5127MaqHnpI2f ;
   private java.util.Date A5124MaqHnpI1i ;
   private java.util.Date A5125MaqHnpI1f ;
   private boolean n610MaqHNPMes ;
   private boolean n5128MaqHnpI3i ;
   private boolean n5129MaqHnpI3f ;
   private boolean n5126MaqHnpI2i ;
   private boolean n5127MaqHnpI2f ;
   private boolean n5124MaqHnpI1i ;
   private boolean n5125MaqHnpI1f ;
   private String A610MaqHNPMes ;
   private java.util.Date[] aP13 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private byte[] aP2 ;
   private short[] aP3 ;
   private byte[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private byte[] aP7 ;
   private java.util.Date[] aP8 ;
   private java.util.Date[] aP9 ;
   private java.util.Date[] aP10 ;
   private java.util.Date[] aP11 ;
   private java.util.Date[] aP12 ;
   private IDataStoreProvider pr_default ;
   private byte[] P04022_A614MaqMes ;
   private short[] P04022_A599MaqAny ;
   private String[] P04022_A602MaqCod ;
   private String[] P04022_A396EmprCod ;
   private String[] P04022_A610MaqHNPMes ;
   private boolean[] P04022_n610MaqHNPMes ;
}

final  class pcal012__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04022", "SELECT MaqMes, MaqAny, MaqCod, EmprCod, MaqHNPMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04023", "UPDATE TXPINTHNP SET MaqHnpI3i=?, MaqHnpI3f=?, MaqHnpI2i=?, MaqHnpI2f=?, MaqHnpI1i=?, MaqHnpI1f=?  WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? and MaqHnpDia = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINTHNP")
         ,new UpdateCursor("P04024", "INSERT INTO TXPINTHNP(EmprCod, MaqCod, MaqAny, MaqMes, MaqHnpDia, MaqHnpI1i, MaqHnpI1f, MaqHnpI2i, MaqHnpI2f, MaqHnpI3i, MaqHnpI3f) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINTHNP")
         ,new UpdateCursor("P04025", "UPDATE TXPMAQHNP SET MaqHNPMes=?  WHERE EmprCod = ? AND MaqCod = ? AND MaqAny = ? AND MaqMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQHNP")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], true);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], true);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], true);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], true);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], true);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[11], true);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setString(8, (String)parms[13], 6);
               stmt.setShort(9, ((Number) parms[14]).shortValue());
               stmt.setByte(10, ((Number) parms[15]).byteValue());
               stmt.setByte(11, ((Number) parms[16]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[6], true);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[8], true);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[10], true);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[12], true);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[14], true);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[16], true);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 63);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

