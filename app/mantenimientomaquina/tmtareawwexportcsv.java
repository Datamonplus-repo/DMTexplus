package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmtareawwexportcsv", "/app.mantenimientomaquina.tmtareawwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmtareawwexportcsv extends GXWebObjectStub
{
   public tmtareawwexportcsv( )
   {
   }

   public tmtareawwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmtareawwexportcsv.class ));
   }

   public tmtareawwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmtareawwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmtareawwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMTarea WWExport CSV";
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

