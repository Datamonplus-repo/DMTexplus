package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmtareageneral", "/app.mantenimientomaquina.tmtareageneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmtareageneral extends GXWebObjectStub
{
   public tmtareageneral( )
   {
   }

   public tmtareageneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmtareageneral.class ));
   }

   public tmtareageneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmtareageneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmtareageneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMTarea General";
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

