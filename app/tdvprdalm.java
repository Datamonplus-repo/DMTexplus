package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdvprdalm", "/app.tdvprdalm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdvprdalm extends GXWebObjectStub
{
   public tdvprdalm( )
   {
   }

   public tdvprdalm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdvprdalm.class ));
   }

   public tdvprdalm( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdvprdalm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdvprdalm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Existencias por Almacen DATA View";
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

