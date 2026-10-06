package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.anticipacionerrores.mdef", "/app.anticipacionerrores.mdef"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mdef extends GXWebObjectStub
{
   public mdef( )
   {
   }

   public mdef( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mdef.class ));
   }

   public mdef( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mdef_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mdef_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MDef";
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

