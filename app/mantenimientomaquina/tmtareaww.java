package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmtareaww", "/app.mantenimientomaquina.tmtareaww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmtareaww extends GXWebObjectStub
{
   public tmtareaww( )
   {
   }

   public tmtareaww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmtareaww.class ));
   }

   public tmtareaww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmtareaww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmtareaww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tareas de Mantenimiento";
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

