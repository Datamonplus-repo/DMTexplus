package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdoctrngeneral", "/app.tdoctrngeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdoctrngeneral extends GXWebObjectStub
{
   public tdoctrngeneral( )
   {
   }

   public tdoctrngeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdoctrngeneral.class ));
   }

   public tdoctrngeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdoctrngeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdoctrngeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDOCTRNGeneral";
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

