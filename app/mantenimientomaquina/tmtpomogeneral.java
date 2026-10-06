package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmtpomogeneral", "/app.mantenimientomaquina.tmtpomogeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmtpomogeneral extends GXWebObjectStub
{
   public tmtpomogeneral( )
   {
   }

   public tmtpomogeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmtpomogeneral.class ));
   }

   public tmtpomogeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmtpomogeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmtpomogeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMTpo Mo General";
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

