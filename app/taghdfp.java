package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.taghdfp", "/app.taghdfp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class taghdfp extends GXWebObjectStub
{
   public taghdfp( )
   {
   }

   public taghdfp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( taghdfp.class ));
   }

   public taghdfp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new taghdfp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new taghdfp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "AGRUPACION P/HDR+PARTIDA";
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

