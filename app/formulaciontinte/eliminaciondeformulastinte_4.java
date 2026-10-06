package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.eliminaciondeformulastinte_4", "/app.formulaciontinte.eliminaciondeformulastinte_4"})
@jakarta.servlet.annotation.MultipartConfig
public final  class eliminaciondeformulastinte_4 extends GXWebObjectStub
{
   public eliminaciondeformulastinte_4( )
   {
   }

   public eliminaciondeformulastinte_4( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( eliminaciondeformulastinte_4.class ));
   }

   public eliminaciondeformulastinte_4( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new eliminaciondeformulastinte_4_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new eliminaciondeformulastinte_4_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "";
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

