package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmtpomoview", "/app.tmtpomoview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmtpomoview extends GXWebObjectStub
{
   public tmtpomoview( )
   {
   }

   public tmtpomoview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmtpomoview.class ));
   }

   public tmtpomoview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmtpomoview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmtpomoview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMTpo Mo View";
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

