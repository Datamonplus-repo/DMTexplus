package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pget_calendariomaquina extends GXProcedure
{
   public pget_calendariomaquina( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pget_calendariomaquina.class ), "" );
   }

   public pget_calendariomaquina( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.ficherosbasicos.SdtSchedulerEvents executeUdp( java.util.Date aP0 ,
                                                             java.util.Date aP1 )
   {
      pget_calendariomaquina.this.aP2 = new app.ficherosbasicos.SdtSchedulerEvents[] {new app.ficherosbasicos.SdtSchedulerEvents()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( java.util.Date aP0 ,
                        java.util.Date aP1 ,
                        app.ficherosbasicos.SdtSchedulerEvents[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( java.util.Date aP0 ,
                             java.util.Date aP1 ,
                             app.ficherosbasicos.SdtSchedulerEvents[] aP2 )
   {
      pget_calendariomaquina.this.AV13dateFrom = aP0;
      pget_calendariomaquina.this.AV14dateTo = aP1;
      pget_calendariomaquina.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV39html = "" ;
      GXt_char1 = AV36Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pget_calendariomaquina.this.GXt_char1 = GXv_char2[0] ;
      AV36Station = GXt_char1 ;
      GXv_char2[0] = AV16EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV36Station, GXv_char2, GXv_char3, GXv_char4) ;
      pget_calendariomaquina.this.AV16EmprCod = GXv_char2[0] ;
      pget_calendariomaquina.this.AV8EmprNom = GXv_char3[0] ;
      pget_calendariomaquina.this.AV10UsurCod = GXv_char4[0] ;
      AV21MaqCod = "" ;
      AV29MaqMes = (byte)(0) ;
      AV21MaqCod = AV11websession.getValue(httpContext.getMessage( "MaqCod", "")) ;
      AV20MaqAny = (short)(GXutil.lval( AV11websession.getValue(httpContext.getMessage( "MaqAny", "")))) ;
      AV29MaqMes = (byte)(GXutil.lval( AV11websession.getValue(httpContext.getMessage( "MaqMes", "")))) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV21MaqCod ,
                                           Byte.valueOf(AV29MaqMes) ,
                                           A602MaqCod ,
                                           Byte.valueOf(A614MaqMes) ,
                                           Short.valueOf(A599MaqAny) ,
                                           Short.valueOf(AV20MaqAny) ,
                                           AV16EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A3X2 */
      pr_default.execute(0, new Object[] {AV16EmprCod, Short.valueOf(AV20MaqAny), AV21MaqCod, Byte.valueOf(AV29MaqMes)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P0A3X2_A602MaqCod[0] ;
         A396EmprCod = P0A3X2_A396EmprCod[0] ;
         A614MaqMes = P0A3X2_A614MaqMes[0] ;
         A599MaqAny = P0A3X2_A599MaqAny[0] ;
         A610MaqHNPMes = P0A3X2_A610MaqHNPMes[0] ;
         n610MaqHNPMes = P0A3X2_n610MaqHNPMes[0] ;
         A606MaqDsc = P0A3X2_A606MaqDsc[0] ;
         n606MaqDsc = P0A3X2_n606MaqDsc[0] ;
         A606MaqDsc = P0A3X2_A606MaqDsc[0] ;
         n606MaqDsc = P0A3X2_n606MaqDsc[0] ;
         AV28MaqHNPMes = A610MaqHNPMes ;
         /* Execute user subroutine: 'GETVALUEDAY' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV22MaqDsc = A606MaqDsc ;
         AV12AuxMaqCod = A602MaqCod ;
         /* Using cursor P0A3X3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5123MaqHnpDia = P0A3X3_A5123MaqHnpDia[0] ;
            A5128MaqHnpI3i = P0A3X3_A5128MaqHnpI3i[0] ;
            n5128MaqHnpI3i = P0A3X3_n5128MaqHnpI3i[0] ;
            A5129MaqHnpI3f = P0A3X3_A5129MaqHnpI3f[0] ;
            n5129MaqHnpI3f = P0A3X3_n5129MaqHnpI3f[0] ;
            A5126MaqHnpI2i = P0A3X3_A5126MaqHnpI2i[0] ;
            n5126MaqHnpI2i = P0A3X3_n5126MaqHnpI2i[0] ;
            A5127MaqHnpI2f = P0A3X3_A5127MaqHnpI2f[0] ;
            n5127MaqHnpI2f = P0A3X3_n5127MaqHnpI2f[0] ;
            A5124MaqHnpI1i = P0A3X3_A5124MaqHnpI1i[0] ;
            n5124MaqHnpI1i = P0A3X3_n5124MaqHnpI1i[0] ;
            A5125MaqHnpI1f = P0A3X3_A5125MaqHnpI1f[0] ;
            n5125MaqHnpI1f = P0A3X3_n5125MaqHnpI1f[0] ;
            A13684HNPInterv1 = DecimalUtil.doubleToDec((GXutil.dtdiff( A5125MaqHnpI1f, A5124MaqHnpI1i))/ (double) (3600)) ;
            A13685HNPInterv2 = DecimalUtil.doubleToDec(GXutil.dtdiff( A5127MaqHnpI2f, A5126MaqHnpI2i)/ (double) (3600)) ;
            A13686HNPInterv3 = DecimalUtil.doubleToDec(GXutil.dtdiff( A5129MaqHnpI3f, A5128MaqHnpI3i)/ (double) (3600)) ;
            if ( A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3).doubleValue() > 0 )
            {
               A13683MaqHNPTota = (byte)(DecimalUtil.decToDouble(GXutil.roundDecimal( A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3), 0).add(DecimalUtil.doubleToDec(((DecimalUtil.compareTo(GXutil.roundDecimal( A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3), 0), A13684HNPInterv1.add(A13685HNPInterv2).add(A13686HNPInterv3))<0) ? 1 : 0))))) ;
            }
            else
            {
               A13683MaqHNPTota = (byte)(0) ;
            }
            AV30MaquinaDate = GXutil.resetTime(localUtil.ymdhmsToT( A599MaqAny, A614MaqMes, A5123MaqHnpDia, (byte)(0), (byte)(0), (byte)(0))) ;
            AV24MaqHnpI1i = A5124MaqHnpI1i ;
            AV23MaqHnpI1f = A5125MaqHnpI1f ;
            AV25MaqHnpI2i = A5126MaqHnpI2i ;
            AV9MaqHnpI2f = A5127MaqHnpI2f ;
            AV27MaqHnpI3i = A5128MaqHnpI3i ;
            AV26MaqHnpI3f = A5129MaqHnpI3f ;
            AV39html = "" ;
            AV39html += httpContext.getMessage( "Inicio Intervalo 1 : ", "") + localUtil.ttoc( AV24MaqHnpI1i, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Fin Intervalo :", "") + localUtil.ttoc( AV23MaqHnpI1f, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Intervalo :", "") + localUtil.format( A13684HNPInterv1, "Z9.99") + httpContext.getMessage( "</br>", "") ;
            AV39html += httpContext.getMessage( "Inicio Intervalo 2 : ", "") + localUtil.ttoc( AV25MaqHnpI2i, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Fin Intervalo :", "") + localUtil.ttoc( AV9MaqHnpI2f, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Intervalo :", "") + localUtil.format( A13685HNPInterv2, "Z9.99") + httpContext.getMessage( "</br>", "") ;
            AV39html += httpContext.getMessage( "Inicio Intervalo 3 : ", "") + localUtil.ttoc( AV27MaqHnpI3i, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Fin Intervalo :", "") + localUtil.ttoc( AV26MaqHnpI3f, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Intervalo :", "") + localUtil.format( A13686HNPInterv3, "Z9.99") + httpContext.getMessage( "</br>", "") ;
            AV39html += httpContext.getMessage( "Total Hora No Productiva : ", "") + localUtil.format( DecimalUtil.doubleToDec(A13683MaqHNPTota), "Z9") + httpContext.getMessage( "</p>", "") ;
            AV42Note = AV40Properties.get(GXutil.trim( GXutil.str( A5123MaqHnpDia, 2, 0))) + httpContext.getMessage( "HR", "") ;
            AV43Hora = AV40Properties.get(GXutil.trim( GXutil.str( A5123MaqHnpDia, 2, 0))) ;
            AV17event = (app.ficherosbasicos.SdtSchedulerEvents_event)new app.ficherosbasicos.SdtSchedulerEvents_event(remoteHandle, context);
            AV17event.setgxTv_SdtSchedulerEvents_event_Id( AV12AuxMaqCod+GXutil.trim( GXutil.str( A5123MaqHnpDia, 2, 0)) );
            AV17event.setgxTv_SdtSchedulerEvents_event_Name( GXutil.trim( AV12AuxMaqCod)+"-"+AV42Note );
            AV17event.setgxTv_SdtSchedulerEvents_event_Notes( AV42Note );
            AV17event.setgxTv_SdtSchedulerEvents_event_Link( "#" );
            AV37StartDateTime = localUtil.ymdhmsToT( A599MaqAny, A614MaqMes, A5123MaqHnpDia, (byte)(0), (byte)(0), (byte)(0)) ;
            AV38EndDateTime = localUtil.ymdhmsToT( A599MaqAny, A614MaqMes, A5123MaqHnpDia, (byte)(0), (byte)(0), (byte)(0)) ;
            AV17event.setgxTv_SdtSchedulerEvents_event_Starttime( AV37StartDateTime );
            AV17event.setgxTv_SdtSchedulerEvents_event_Endtime( AV38EndDateTime );
            AV17event.setgxTv_SdtSchedulerEvents_event_Additionalinformation( AV39html );
            if ( AV38EndDateTime.after( GXutil.serverDate( context, remoteHandle, pr_default) ) )
            {
               AV17event.setgxTv_SdtSchedulerEvents_event_Color( "#2E8B57" );
            }
            else if ( AV38EndDateTime.before( GXutil.serverDate( context, remoteHandle, pr_default) ) )
            {
               AV17event.setgxTv_SdtSchedulerEvents_event_Color( "#FF0000" );
            }
            else
            {
               AV17event.setgxTv_SdtSchedulerEvents_event_Color( "" );
            }
            AV17event.setgxTv_SdtSchedulerEvents_event_Backgroundcolor( "" );
            AV17event.setgxTv_SdtSchedulerEvents_event_Nameweekview( "" );
            AV17event.setgxTv_SdtSchedulerEvents_event_Namemonthview( "" );
            AV17event.setgxTv_SdtSchedulerEvents_event_Namedayview( "" );
            AV17event.setgxTv_SdtSchedulerEvents_event_Tooltip( AV39html );
            AV18Events.getgxTv_SdtSchedulerEvents_Items().add(AV17event, 0);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'GETVALUEDAY' Routine */
      returnInSub = false ;
      AV40Properties.clear();
      AV32matchCollection = GxRegex.Matches(AV28MaqHNPMes,"[0-9]{2}|[0-9]{1}") ;
      AV40Properties = (com.genexus.util.GXProperties)new com.genexus.util.GXProperties();
      AV19i = (byte)(1) ;
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV32matchCollection.size() )
      {
         AV31match = (GxRegexMatch)((GxRegexMatch)AV32matchCollection.elementAt(-1+AV48GXV1));
         AV40Properties.set(GXutil.trim( GXutil.str( AV19i, 2, 0)), GXutil.trim( AV31match.getValue()));
         AV19i = (byte)(AV19i+1) ;
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP2[0] = pget_calendariomaquina.this.AV18Events;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Events = new app.ficherosbasicos.SdtSchedulerEvents(remoteHandle, context);
      AV39html = "" ;
      AV36Station = "" ;
      GXt_char1 = "" ;
      AV16EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV8EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV10UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV21MaqCod = "" ;
      AV11websession = httpContext.getWebSession();
      scmdbuf = "" ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      P0A3X2_A602MaqCod = new String[] {""} ;
      P0A3X2_A396EmprCod = new String[] {""} ;
      P0A3X2_A614MaqMes = new byte[1] ;
      P0A3X2_A599MaqAny = new short[1] ;
      P0A3X2_A610MaqHNPMes = new String[] {""} ;
      P0A3X2_n610MaqHNPMes = new boolean[] {false} ;
      P0A3X2_A606MaqDsc = new String[] {""} ;
      P0A3X2_n606MaqDsc = new boolean[] {false} ;
      A610MaqHNPMes = "" ;
      A606MaqDsc = "" ;
      AV28MaqHNPMes = "" ;
      AV22MaqDsc = "" ;
      AV12AuxMaqCod = "" ;
      P0A3X3_A396EmprCod = new String[] {""} ;
      P0A3X3_A602MaqCod = new String[] {""} ;
      P0A3X3_A599MaqAny = new short[1] ;
      P0A3X3_A614MaqMes = new byte[1] ;
      P0A3X3_A5123MaqHnpDia = new byte[1] ;
      P0A3X3_A5128MaqHnpI3i = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3X3_n5128MaqHnpI3i = new boolean[] {false} ;
      P0A3X3_A5129MaqHnpI3f = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3X3_n5129MaqHnpI3f = new boolean[] {false} ;
      P0A3X3_A5126MaqHnpI2i = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3X3_n5126MaqHnpI2i = new boolean[] {false} ;
      P0A3X3_A5127MaqHnpI2f = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3X3_n5127MaqHnpI2f = new boolean[] {false} ;
      P0A3X3_A5124MaqHnpI1i = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3X3_n5124MaqHnpI1i = new boolean[] {false} ;
      P0A3X3_A5125MaqHnpI1f = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3X3_n5125MaqHnpI1f = new boolean[] {false} ;
      A5128MaqHnpI3i = GXutil.resetTime( GXutil.nullDate() );
      A5129MaqHnpI3f = GXutil.resetTime( GXutil.nullDate() );
      A5126MaqHnpI2i = GXutil.resetTime( GXutil.nullDate() );
      A5127MaqHnpI2f = GXutil.resetTime( GXutil.nullDate() );
      A5124MaqHnpI1i = GXutil.resetTime( GXutil.nullDate() );
      A5125MaqHnpI1f = GXutil.resetTime( GXutil.nullDate() );
      A13684HNPInterv1 = DecimalUtil.ZERO ;
      A13685HNPInterv2 = DecimalUtil.ZERO ;
      A13686HNPInterv3 = DecimalUtil.ZERO ;
      AV30MaquinaDate = GXutil.nullDate() ;
      AV24MaqHnpI1i = GXutil.resetTime( GXutil.nullDate() );
      AV23MaqHnpI1f = GXutil.resetTime( GXutil.nullDate() );
      AV25MaqHnpI2i = GXutil.resetTime( GXutil.nullDate() );
      AV9MaqHnpI2f = GXutil.resetTime( GXutil.nullDate() );
      AV27MaqHnpI3i = GXutil.resetTime( GXutil.nullDate() );
      AV26MaqHnpI3f = GXutil.resetTime( GXutil.nullDate() );
      AV42Note = "" ;
      AV40Properties = new com.genexus.util.GXProperties();
      AV43Hora = "" ;
      AV17event = new app.ficherosbasicos.SdtSchedulerEvents_event(remoteHandle, context);
      AV37StartDateTime = GXutil.resetTime( GXutil.nullDate() );
      AV38EndDateTime = GXutil.resetTime( GXutil.nullDate() );
      AV32matchCollection = new com.genexus.GxUnknownObjectCollection();
      AV31match = new GxRegexMatch();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.pget_calendariomaquina__default(),
         new Object[] {
             new Object[] {
            P0A3X2_A602MaqCod, P0A3X2_A396EmprCod, P0A3X2_A614MaqMes, P0A3X2_A599MaqAny, P0A3X2_A610MaqHNPMes, P0A3X2_n610MaqHNPMes, P0A3X2_A606MaqDsc, P0A3X2_n606MaqDsc
            }
            , new Object[] {
            P0A3X3_A396EmprCod, P0A3X3_A602MaqCod, P0A3X3_A599MaqAny, P0A3X3_A614MaqMes, P0A3X3_A5123MaqHnpDia, P0A3X3_A5128MaqHnpI3i, P0A3X3_n5128MaqHnpI3i, P0A3X3_A5129MaqHnpI3f, P0A3X3_n5129MaqHnpI3f, P0A3X3_A5126MaqHnpI2i,
            P0A3X3_n5126MaqHnpI2i, P0A3X3_A5127MaqHnpI2f, P0A3X3_n5127MaqHnpI2f, P0A3X3_A5124MaqHnpI1i, P0A3X3_n5124MaqHnpI1i, P0A3X3_A5125MaqHnpI1f, P0A3X3_n5125MaqHnpI1f
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV29MaqMes ;
   private byte A614MaqMes ;
   private byte A5123MaqHnpDia ;
   private byte A13683MaqHNPTota ;
   private byte AV19i ;
   private short AV20MaqAny ;
   private short A599MaqAny ;
   private short Gx_err ;
   private int AV48GXV1 ;
   private java.math.BigDecimal A13684HNPInterv1 ;
   private java.math.BigDecimal A13685HNPInterv2 ;
   private java.math.BigDecimal A13686HNPInterv3 ;
   private String AV36Station ;
   private String GXt_char1 ;
   private String AV16EmprCod ;
   private String GXv_char2[] ;
   private String AV8EmprNom ;
   private String GXv_char3[] ;
   private String AV10UsurCod ;
   private String GXv_char4[] ;
   private String AV21MaqCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private String AV22MaqDsc ;
   private String AV12AuxMaqCod ;
   private java.util.Date A5128MaqHnpI3i ;
   private java.util.Date A5129MaqHnpI3f ;
   private java.util.Date A5126MaqHnpI2i ;
   private java.util.Date A5127MaqHnpI2f ;
   private java.util.Date A5124MaqHnpI1i ;
   private java.util.Date A5125MaqHnpI1f ;
   private java.util.Date AV24MaqHnpI1i ;
   private java.util.Date AV23MaqHnpI1f ;
   private java.util.Date AV25MaqHnpI2i ;
   private java.util.Date AV9MaqHnpI2f ;
   private java.util.Date AV27MaqHnpI3i ;
   private java.util.Date AV26MaqHnpI3f ;
   private java.util.Date AV37StartDateTime ;
   private java.util.Date AV38EndDateTime ;
   private java.util.Date AV13dateFrom ;
   private java.util.Date AV14dateTo ;
   private java.util.Date AV30MaquinaDate ;
   private boolean n610MaqHNPMes ;
   private boolean n606MaqDsc ;
   private boolean returnInSub ;
   private boolean n5128MaqHnpI3i ;
   private boolean n5129MaqHnpI3f ;
   private boolean n5126MaqHnpI2i ;
   private boolean n5127MaqHnpI2f ;
   private boolean n5124MaqHnpI1i ;
   private boolean n5125MaqHnpI1f ;
   private String AV39html ;
   private String A610MaqHNPMes ;
   private String AV28MaqHNPMes ;
   private String AV42Note ;
   private String AV43Hora ;
   private com.genexus.webpanels.WebSession AV11websession ;
   private com.genexus.util.GXProperties AV40Properties ;
   private app.ficherosbasicos.SdtSchedulerEvents[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A3X2_A602MaqCod ;
   private String[] P0A3X2_A396EmprCod ;
   private byte[] P0A3X2_A614MaqMes ;
   private short[] P0A3X2_A599MaqAny ;
   private String[] P0A3X2_A610MaqHNPMes ;
   private boolean[] P0A3X2_n610MaqHNPMes ;
   private String[] P0A3X2_A606MaqDsc ;
   private boolean[] P0A3X2_n606MaqDsc ;
   private String[] P0A3X3_A396EmprCod ;
   private String[] P0A3X3_A602MaqCod ;
   private short[] P0A3X3_A599MaqAny ;
   private byte[] P0A3X3_A614MaqMes ;
   private byte[] P0A3X3_A5123MaqHnpDia ;
   private java.util.Date[] P0A3X3_A5128MaqHnpI3i ;
   private boolean[] P0A3X3_n5128MaqHnpI3i ;
   private java.util.Date[] P0A3X3_A5129MaqHnpI3f ;
   private boolean[] P0A3X3_n5129MaqHnpI3f ;
   private java.util.Date[] P0A3X3_A5126MaqHnpI2i ;
   private boolean[] P0A3X3_n5126MaqHnpI2i ;
   private java.util.Date[] P0A3X3_A5127MaqHnpI2f ;
   private boolean[] P0A3X3_n5127MaqHnpI2f ;
   private java.util.Date[] P0A3X3_A5124MaqHnpI1i ;
   private boolean[] P0A3X3_n5124MaqHnpI1i ;
   private java.util.Date[] P0A3X3_A5125MaqHnpI1f ;
   private boolean[] P0A3X3_n5125MaqHnpI1f ;
   private GxRegexMatch AV31match ;
   private com.genexus.GxUnknownObjectCollection AV32matchCollection ;
   private app.ficherosbasicos.SdtSchedulerEvents AV18Events ;
   private app.ficherosbasicos.SdtSchedulerEvents_event AV17event ;
}

final  class pget_calendariomaquina__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A3X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV21MaqCod ,
                                          byte AV29MaqMes ,
                                          String A602MaqCod ,
                                          byte A614MaqMes ,
                                          short A599MaqAny ,
                                          short AV20MaqAny ,
                                          String AV16EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[4];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.MaqCod, T1.EmprCod, T1.MaqMes, T1.MaqAny, T1.MaqHNPMes, T2.MaqDsc FROM (TXPMAQHNP T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod =" ;
      scmdbuf += " T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MaqAny = ?)");
      if ( ! (GXutil.strcmp("", AV21MaqCod)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (0==AV29MaqMes) )
      {
         addWhere(sWhereString, "(T1.MaqMes = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P0A3X2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A3X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3X3", "SELECT EmprCod, MaqCod, MaqAny, MaqMes, MaqHnpDia, MaqHnpI3i, MaqHnpI3f, MaqHnpI2i, MaqHnpI2f, MaqHnpI1i, MaqHnpI1f FROM TXPINTHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = GXutil.resetDate(rslt.getGXDateTime(9));
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = GXutil.resetDate(rslt.getGXDateTime(10));
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = GXutil.resetDate(rslt.getGXDateTime(11));
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[5]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[7]).byteValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

