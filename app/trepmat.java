package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trepmat", "/app.trepmat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trepmat extends GXWebObjectStub
{
   public trepmat( )
   {
   }

   public trepmat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trepmat.class ));
   }

   public trepmat( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trepmat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trepmat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RECEPCION TELA,MATERIALES";
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

