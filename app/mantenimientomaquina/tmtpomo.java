package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmtpomo", "/app.mantenimientomaquina.tmtpomo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmtpomo extends GXWebObjectStub
{
   public tmtpomo( )
   {
   }

   public tmtpomo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmtpomo.class ));
   }

   public tmtpomo( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmtpomo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmtpomo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipo de Mov en Mantto";
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

