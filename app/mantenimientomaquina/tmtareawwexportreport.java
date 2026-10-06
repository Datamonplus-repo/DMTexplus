package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmtareawwexportreport", "/app.mantenimientomaquina.tmtareawwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmtareawwexportreport extends GXWebObjectStub
{
   public tmtareawwexportreport( )
   {
   }

   public tmtareawwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmtareawwexportreport.class ));
   }

   public tmtareawwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmtareawwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmtareawwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMTarea WWExport Report";
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

