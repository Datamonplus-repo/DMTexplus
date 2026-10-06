package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmtareaview", "/app.tmtareaview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmtareaview extends GXWebObjectStub
{
   public tmtareaview( )
   {
   }

   public tmtareaview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmtareaview.class ));
   }

   public tmtareaview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmtareaview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmtareaview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMTarea View";
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

