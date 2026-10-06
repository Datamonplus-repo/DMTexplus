package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnormasgeneral", "/app.tnormasgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnormasgeneral extends GXWebObjectStub
{
   public tnormasgeneral( )
   {
   }

   public tnormasgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnormasgeneral.class ));
   }

   public tnormasgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnormasgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnormasgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TNORMASGeneral";
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

