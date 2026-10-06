package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmtpomoww", "/app.mantenimientomaquina.tmtpomoww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmtpomoww extends GXWebObjectStub
{
   public tmtpomoww( )
   {
   }

   public tmtpomoww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmtpomoww.class ));
   }

   public tmtpomoww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.mantenimientomaquina.tmtpomoww_impl pgm = new app.mantenimientomaquina.tmtpomoww_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmtpomoww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmtpomoww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tipo de Mov en Mantto";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

