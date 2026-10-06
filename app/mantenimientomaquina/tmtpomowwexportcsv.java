package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmtpomowwexportcsv", "/app.mantenimientomaquina.tmtpomowwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmtpomowwexportcsv extends GXWebObjectStub
{
   public tmtpomowwexportcsv( )
   {
   }

   public tmtpomowwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmtpomowwexportcsv.class ));
   }

   public tmtpomowwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmtpomowwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmtpomowwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMTpo Mo WWExport CSV";
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

